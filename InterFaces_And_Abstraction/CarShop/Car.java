package InterFaces_And_Abstraction.CarShop;

import java.io.Serializable;

public interface Car extends Serializable {

    int TIRES = 4;
    String getModel();
    String getColor();
    int getHorsePower();
    String countryProduction();

}
