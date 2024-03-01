package InterFaces_And_Abstraction.Exercise.BirthdayCelebrations_03;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Birthable> birthables = new ArrayList<>();

        String input = scanner.nextLine();
        while (!input.equals("End")) {
            String[] tokens = input.split("\\s+");
            switch (tokens[0]) {
                case "Citizen":
                    String citizenName = tokens[1];
                    int citizenAge = Integer.parseInt(tokens[2]);
                    String citizenId = tokens[3];
                    String citizenData = tokens[4];
                    Citizen citizen = new Citizen(citizenName,citizenAge,citizenId,citizenData);
                    birthables.add(citizen);
                    break;
                case "Pet":
                    String petName = tokens[1];
                    String petData = tokens[2];
                    Pet pet = new Pet(petName,petData);
                    birthables.add(pet);
                    break;
            }
            input = scanner.nextLine();
        }
        String dataYear = scanner.nextLine();

        for (Birthable birthable : birthables) {
         if (birthable.getBirthDate().endsWith(dataYear)) {
             System.out.println(birthable.getBirthDate());
         }
        }





    }

}
