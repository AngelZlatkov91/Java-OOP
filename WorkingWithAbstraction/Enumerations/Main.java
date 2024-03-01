package WorkingWithAbstraction.Enumerations;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Day mon = Day.valueOf("MON");
        System.out.println(mon.name());


        System.out.println(Day.MON.ordinal());// pozicia na MON

        String mons = "MON";
        System.out.println(mons.equals(input));
        System.out.println(Day.valueOf(input).getOrder());


    }
}
