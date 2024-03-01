package WorkingWithAbstraction.Enumerations;

public enum Day {
    MON(1),TUE(2),ASD(3);

    private int order;

    Day(int order) {
        this.order = order;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }
}
