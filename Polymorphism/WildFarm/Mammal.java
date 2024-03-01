package Polymorphism.WildFarm;

import java.text.DecimalFormat;

public abstract class Mammal extends Animal{
    private String livingRegion;

    public Mammal(String animalName, String animalType, Double animalWeight, String livingRegion) {
        super(animalName, animalType, animalWeight);
        this.livingRegion = livingRegion;
    }

    protected String getLivingRegion() {
        return livingRegion;
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#,##");
        String template = String.format("%s[%s, %.2f, %s, %d]",this.getAnimalType(),this.getAnimalName(),
                this.getAnimalWeight(),this.getLivingRegion(),this.getFoodEaten());
        return template;
    }
}
