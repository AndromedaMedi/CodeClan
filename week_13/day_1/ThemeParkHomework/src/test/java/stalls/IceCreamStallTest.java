package stalls;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IceCreamStallTest {

    IceCreamStall iceCreamStall;

    @Before
    public void before() {
        iceCreamStall = new IceCreamStall("Fregio", "James Fregio", 9, ParkingSpot.A3);
    }

    @Test
    public void iceCreamStallHasName() {
        assertEquals("Fregio", iceCreamStall.getName());
    }

    @Test
    public void iceCreamStallOwnerName() {
        assertEquals("James Fregio", iceCreamStall.getOwnerName());
    }

    @Test
    public void iceCreamStallHasRating() {
        assertEquals(9, iceCreamStall.getRating());
    }

    @Test
    public void iceCreamStallHasParkingSpot() {
        assertEquals(ParkingSpot.A3, iceCreamStall.getParkingSpot());
    }
}
