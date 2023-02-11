public enum PlaneType {

    BOEING_747(80, 100.00),
    BOEING_CO(5, 20.00),
    AIRBUS_A380(120, 200.00),
    AIRBUS_A600(180, 260.00);

    private int capacity;
    private double weight;

    PlaneType(int capacity, double weight) {
        this.capacity = capacity;
        this.weight = weight;
    }

    public int getCapacity() {
        return capacity;
    }

    public double getWeight() {
        return weight;
    }
}
