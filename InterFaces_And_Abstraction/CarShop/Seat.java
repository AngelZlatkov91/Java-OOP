package InterFaces_And_Abstraction.CarShop;

public class Seat implements Car{
    private String model;
    private String color;
    private int horsPower;
    private String countryProduced;

    public Seat(String model, String color, int horsPower, String countryProduced) {
        this.model = model;
        this.color = color;
        this.horsPower = horsPower;
        this.countryProduced = countryProduced;
    }

    @Override
    public String getModel() {
        return this.model;
    }

    @Override
    public String getColor() {
        return this.color;
    }

    @Override
    public int getHorsePower() {
        return this.horsPower;
    }

    @Override
    public String countryProduction() {
        return this.countryProduced;
    }

    @Override
    public String toString() {
        return String.format("This is %s produced in %s and have %d tires",
                this.getModel(),this.countryProduced, Car.TIRES);
    }
}
