package stalls;

public class IceCreamStall extends Stall {

    public IceCreamStall(String name, String ownerName, int rating, ParkingSpot parkingSpot) {
        super(name, ownerName, rating, parkingSpot);
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
