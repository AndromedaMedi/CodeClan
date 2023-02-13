package stalls;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CandyFlossStallTest {

    CandyFlossStall candyFlossStall;

    @Before
    public void before() {
        candyFlossStall = new CandyFlossStall("Pink Dreams", "Dolly Cloud", 9, ParkingSpot.A1);
    }

    @Test
    public void candyFlossStallHasName() {
        assertEquals("Pink Dreams", candyFlossStall.getName());
    }

    @Test
    public void candyFlossStallHasOwnerName() {
        assertEquals("Dolly Cloud", candyFlossStall.getOwnerName());
    }

    @Test
    public void candyFlossStallHasRating() {
        assertEquals(9, candyFlossStall.getRating());
    }

    @Test
    public void candyFlossStallHasParkingSpot() {
        assertEquals(ParkingSpot.A1, candyFlossStall.getParkingSpot());
    }
}
