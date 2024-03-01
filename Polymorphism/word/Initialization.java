package Polymorphism.word;

public class Initialization {
    public static CommandInterface buildCommandInterface(StringBuilder text) {
        CommandInterface advancedInterfave = new AdvancedCommandImpl(text);
        advancedInterfave.init();
        return advancedInterfave;



    }
}
