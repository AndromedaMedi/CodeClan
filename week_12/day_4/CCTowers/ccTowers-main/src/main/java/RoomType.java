public enum RoomType {

    SINGLE(1, 20),
    DOUBLE(2, 35),
    TRIPLE(3, 50),
    FAMILY(5, 70),
    SMALL_CONFERENCE(20, 100),
    LARGE_CONFERENCE(100, 150);

    private final int capacity;

    private final int rate;

    RoomType(int capacity, int rate) {
        this.capacity = capacity;
        this.rate = rate;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getRate() {
        return rate;
    }
}
