package InterFaces_And_Abstraction.Exercise.MilitaryElite_06.Implementation;

import InterFaces_And_Abstraction.Exercise.MilitaryElite_06.Interfaces.LieutenantGeneral;
import InterFaces_And_Abstraction.Exercise.MilitaryElite_06.Interfaces.Private;

import java.util.Collection;

public class LieutenantGeneralImpl extends PrivateImpl implements LieutenantGeneral {
    private Collection<Private> privates;

    public LieutenantGeneralImpl(int id, String firstName, String lastName, double salary, Collection<Private> privates) {
        super(id, firstName, lastName, salary);
        this.privates = privates;
    }

    @Override
    public Collection<Private> getPrivates() {
        return this.privates;
    }

    @Override
    public void addPrivate(Private priv) {
        this.privates.add(priv);
    }

}
