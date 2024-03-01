package InterFaces_And_Abstraction.Exercise.MilitaryElite_06.Interfaces;

import java.util.Collection;

public interface Engineer {
    void addRepair(Repair repair);
    Collection<Repair> getRepairs();

}
