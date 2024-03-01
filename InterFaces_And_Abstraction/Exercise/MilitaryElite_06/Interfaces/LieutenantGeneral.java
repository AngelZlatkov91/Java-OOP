package InterFaces_And_Abstraction.Exercise.MilitaryElite_06.Interfaces;

import java.util.Collection;

public interface LieutenantGeneral {

    Collection<Private> getPrivates();
    void addPrivate (Private priv);
}
