package WorkingWithAbstraction.CardRank;


public class Main {
    public static void main(String[] args) {
        System.out.println("Card Ranks:");
        for (CardRanks value : CardRanks.values()) {
            System.out.printf("Ordinal value: %d; Name value: %s%n",value.ordinal(),value);
        }

    }
}
