package stalls;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotDogStallTest {

    private HotDogStall hotDogStall;

    @Before
    public void before() {
        hotDogStall = new HotDogStall("Bread Bangers", "John Dog", 6, ParkingSpot.B2);
    }

    @Test
    public void hotDogStallHasName() {
        assertEquals("Bread Bangers", hotDogStall.getName());
    }

    @Test
    public void hotDogStallHasOwnerName() {
        assertEquals("John Dog", hotDogStall.getOwnerName());
    }

    @Test
    public void hotDogStallHasRating() {
        assertEquals(6, hotDogStall.getRating());
    }

    @Test
    public void hotDogStallHasParkingSpot() {
        assertEquals(ParkingSpot.B2, hotDogStall.getParkingSpot());
    }
}
