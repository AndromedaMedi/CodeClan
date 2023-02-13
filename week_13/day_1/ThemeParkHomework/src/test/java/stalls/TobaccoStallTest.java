package stalls;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class TobaccoStallTest {

    public TobaccoStall tobaccoStall;
    public Visitor visitor;

    @Before
    public void before() {
        tobaccoStall = new TobaccoStall("Smoke Cloud", "Dean Smoke", 3, ParkingSpot.B2);
    }

    @Test
    public void tobaccoStallHasName() {
        assertEquals("Smoke Cloud", tobaccoStall.getName());
    }

    @Test
    public void tobaccoStallHasOwnerName() {
        assertEquals("Dean Smoke", tobaccoStall.getOwnerName());
    }

    @Test
    public void tobaccoStallHasRating() {
        assertEquals(3, tobaccoStall.getRating());
    }

    @Test
    public void tobaccoStallHasParkingSpot() {
        assertEquals(ParkingSpot.B2, tobaccoStall.getParkingSpot());
    }

    @Test
    public void visitorNotAllowedIfUnder18() {
        visitor = new Visitor(15, 145, 15.00);
        assertEquals(false, tobaccoStall.isAllowed(visitor));
    }

    @Test
    public void visitorIsAllowedIfOver18() {
        visitor = new Visitor(22, 160, 35.00);
        assertEquals(true, tobaccoStall.isAllowed(visitor));
    }
}
