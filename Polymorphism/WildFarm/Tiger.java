package Polymorphism.WildFarm;

public class Tiger extends Felime{


    public Tiger(String animalName, String animalType, Double animalWeight,
                 String livingRegion) {
        super(animalName, animalType, animalWeight, livingRegion);

    }

    @Override
    public void makeSound() {
        System.out.println("ROAR!!!");
    }

    @Override
    public void eat(Food food) {
       if (food instanceof Meat) {
           this.setFoodEaten(food.getQuantity());
       } else {
           System.out.println("Tigers are not eating that type of food!");
       }
    }
}
