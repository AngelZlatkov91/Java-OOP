package InterFaces_And_Abstraction.Exercise.MilitaryElite_06.Implementation;

import InterFaces_And_Abstraction.Exercise.MilitaryElite_06.Interfaces.Commando;
import InterFaces_And_Abstraction.Exercise.MilitaryElite_06.Interfaces.Mission;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class CommandoImpl extends SpecialisedSoldierImpl implements Commando {



    private Collection<Mission> missions;


    public CommandoImpl(int id, String firstName,
                        String lastName, double salary,
                        String corps,
                        Collection<Mission> missions) {
        super(id, firstName, lastName, salary, corps);
           this.setMissions(missions);
    }


    @Override
    public void addMission(Mission mission) {
         this.missions.add(mission);
    }

    @Override
    public Collection<Mission> getMissions() {
        return Collections.unmodifiableCollection(this.missions);
    }

    public void setMissions(Collection<Mission> missions) {
        if (missions != null) {
            this.missions = missions;
        } else {
            this.missions = new ArrayList<>();
        }

    }
}
