package InterFaces_And_Abstraction.BorderControl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Identifiable> identifiables = new ArrayList<>();

        String input = scanner.nextLine();
        while (!input.equals("End")) {
            String[] dataLine = input.split("\\s+");
            if (dataLine.length ==3) {
               String name = dataLine[0];
               int age = Integer.parseInt(dataLine[1]);
               String id = dataLine[2];
               Identifiable citizen = new Citizen(name,age,id);
               identifiables.add(citizen);
            } else if (dataLine.length == 2) {
                 String name = dataLine[0];
                 String id = dataLine[1];
                 Identifiable robotic = new Robot(name,id);
                 identifiables.add(robotic);
            }
            input = scanner.nextLine();
        }
        String lastIdNumbers = scanner.nextLine();

       identifiables.stream()
               .filter(i -> i.getID().endsWith(lastIdNumbers))
               .forEach(i -> System.out.println(i.getID()));
    }
}
