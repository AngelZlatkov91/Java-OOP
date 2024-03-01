package InterFaces_And_Abstraction.CarShopExtend;

public class Seat extends CarImpl  implements Sellable{
    private Double price;
    public Seat(String model, String color, int horsPower, String countryProduced , Double price) {
        super(model, color, horsPower, countryProduced);
        this.price = price;
    }

   @Override
   public String toString() {
      return String.format("Leon sells for %f",
            this.getPrice());
  }

    @Override
    public Double getPrice() {
        return this.price;
    }
}
