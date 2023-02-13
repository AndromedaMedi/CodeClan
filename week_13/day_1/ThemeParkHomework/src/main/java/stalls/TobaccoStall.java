package stalls;

import behaviours.ISecurity;
import people.Visitor;

public class TobaccoStall extends Stall implements ISecurity {

    public Visitor visitor;

    public TobaccoStall(String name, String ownerName, int rating, ParkingSpot parkingSpot) {
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

    @Override
    public boolean isAllowed(Visitor visitor) {
        int age = visitor.getAge();
        if (age < 18) {
            return false;
        } else {
            return true;
        }
    }
}
