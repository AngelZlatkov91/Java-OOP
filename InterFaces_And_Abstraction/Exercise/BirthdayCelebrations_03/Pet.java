package InterFaces_And_Abstraction.Exercise.BirthdayCelebrations_03;

public class Pet implements Birthable{
    private String name;
    private String birthData;

    public Pet(String name, String birthData) {
        this.name = name;
        this.birthData = birthData;
    }

    @Override
    public String getBirthDate() {
        return this.birthData;
    }

    public String getName() {
        return name;
    }
}
