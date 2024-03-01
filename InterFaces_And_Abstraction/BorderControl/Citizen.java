package InterFaces_And_Abstraction.BorderControl;

public class Citizen implements Identifiable {
    private String name;
    private int age;
    private String id;

    public Citizen(String name, int age, String id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    @Override
    public String getID() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }


}
