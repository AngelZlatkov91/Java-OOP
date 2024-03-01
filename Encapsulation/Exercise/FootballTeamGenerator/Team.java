package Encapsulation.Exercise.FootballTeamGenerator;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private String name;
    private List<Player> players;

    public Team(String name) {
        this.setName(name);
        this.players = new ArrayList<>();
    }
    public void addPlayer (Player player) {
      this.players.add(player);
    }
    public void removePlayer (String name) {
        boolean isRemoved  = this.players.removeIf(p->p.getName().equals(name));
         if (!isRemoved) {
             String print = String.format("Player %s is not in %s team.",name,this.name);
             System.out.println(print);
         }
    }

    public String getName() {
        return name;
    }
    public double getRating () {
        return this.players
                .stream()
                .mapToDouble(Player::overallSkillLevel)
                .average()
                .orElse(0);

    }

    private void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            System.out.println("A name should not be empty.");
        } else {
            this.name = name;
        }

    }
}
