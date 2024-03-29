package InterFaces_And_Abstraction.Exercise.MilitaryElite_06.Implementation;

import InterFaces_And_Abstraction.Exercise.MilitaryElite_06.Interfaces.Repair;

public class RepairImpl  implements Repair {
    private String partName;
    private int workedHours;

    public RepairImpl(String partName, int workedHours) {
        this.partName = partName;
        this.workedHours = workedHours;
    }

    @Override
    public String getPartName() {
        return this.partName;
    }

    @Override
    public int getWorkedHours() {
        return this.workedHours;
    }
}
