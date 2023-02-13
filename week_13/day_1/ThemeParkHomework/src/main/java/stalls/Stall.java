package stalls;

public abstract class Stall {

    public String name;
    public String ownerName;

    public int rating ;
    public ParkingSpot parkingSpot;

    public Stall(String name, String ownerName, int rating, ParkingSpot parkingSpot) {
        this.name = name;
        this.ownerName = ownerName;
        this.rating = rating;
        this.parkingSpot = parkingSpot;
    }

    public String getName() {
        return name;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public int getRating() {
        return rating;
    }

    public ParkingSpot getParkingSpot() {
        return parkingSpot;
    }
}
