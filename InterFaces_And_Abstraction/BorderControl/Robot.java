package InterFaces_And_Abstraction.BorderControl;

public class Robot implements Identifiable{
    private String id;
    private String model;

    public Robot(String id, String model) {
        this.id = id;
        this.model = model;
    }

    @Override
    public String getID() {
        return this.id;
    }


    public String getModel() {
        return this.model;
    }
}
