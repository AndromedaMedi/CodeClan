package stalls;

import behaviours.IReviewed;

public class CandyFlossStall extends Stall implements IReviewed {

    public CandyFlossStall(String name, String ownerName, int rating, ParkingSpot parkingSpot) {
        super(name, ownerName, rating, parkingSpot);
    }

    @Override
    public int getRating() {
        return rating;
    }

    @Override
    public String getName() {
        return name;
    }
}
