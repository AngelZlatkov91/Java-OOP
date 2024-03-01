package WorkingWithAbstraction.CardsWtihPower;

public enum CardSuit {
    CLUBS(0),
    DIAMONDS(13),
    HEARTS(26),
    SPADES(39);

    private final int power;

    CardSuit(int suit) {
        this.power = suit;
    }

    public int getPower() {
        return power;
    }
}
