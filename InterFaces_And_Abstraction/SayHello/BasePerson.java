package InterFaces_And_Abstraction.SayHello;

public abstract class BasePerson implements Person {

    private String name;

    public BasePerson(String name) {
        this.setName(name);
    }

    private void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public abstract  String sayHello();
}
