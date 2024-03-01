package WorkingWithAbstraction.CardsWtihPower;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String rank = scanner.nextLine();
        String suit = scanner.nextLine();
        CardsPower cardPower = CardsPower.valueOf(rank);
        CardSuit cardSuit = CardSuit.valueOf(suit);
        int power = cardPower.getPower() + cardSuit.getPower();
        System.out.printf("Card name: %s of %s; Card power: %d",cardPower,cardSuit, power);


    }
}
