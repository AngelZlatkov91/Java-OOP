package Encapsulation.Exercise.FootballTeamGenerator;

public class Player {
    private String name;
    private int endurance;
    private int sprint;
    private int dribble;
    private int passing;
    private int shooting;

    public Player(String name, int endurance, int sprint, int dribble, int passing, int shooting) {
        this.setName(name);
        this.setEndurance(endurance);
        this.setSprint(sprint);
        this.setDribble(dribble);
        this.setPassing(passing);
        this.setShooting(shooting);
    }

    public String getName() {
        return name;
    }
    public double overallSkillLevel () {
        return (this.endurance + this.sprint + this.dribble + this.passing + this.shooting)  / 5.0;
    }

    private void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            System.out.println("A name should not be empty.");
        }
            this.name = name;


    }

    private void setEndurance(int endurance) {
        if (!isValidateStat(endurance,"Endurance")) {
            this.endurance = endurance;
        }
    }

    private void setSprint(int sprint) {
        if (!isValidateStat(sprint,"Sprint")) {
            this.sprint = sprint;
        }
    }

    private void setDribble(int dribble) {
        if (!isValidateStat(dribble,"Dribble")) {
            this.dribble = dribble;
        }
    }

    private void setPassing(int passing) {
        if (!isValidateStat(passing,"Passing")) {
            this.passing = passing;
        }
    }

    private void setShooting(int shooting) {
      if (!isValidateStat(shooting,"Shooting")) {
          this.shooting = shooting;
      }

    }
    private boolean isValidateStat (int statValue, String statName) {
        boolean isValid = statValue < 0 || statValue > 100;
        if (isValid) {
            String massage = String.format("%s should be between 0 and 100.%n", statName);
            System.out.printf("%s should be between 0 and 100.%n", statName);
            throw new IllegalArgumentException(statName);
        }
        return isValid;

    }
}
