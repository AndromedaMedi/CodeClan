package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class DodgemsTest {

    private Dodgems dodgems;

    private Visitor visitor;

    @Before
    public void before() {
        dodgems = new Dodgems("Bumper Cars", 7);
    }

    @Test
    public void dodgemsHasName() {
        assertEquals("Bumper Cars", dodgems.getName());
    }

    @Test
    public void dodgemsHasRating() {
        assertEquals(7, dodgems.getRating());
    }

    @Test
    public void dodgemsHasVisitorCount() {
        assertEquals(0, dodgems.getVisitCount());
    }

    @Test
    public void dodgemsHasDefaultPrice() {
        assertEquals(4.50, dodgems.defaultPrice(4.50), 0.1);
    }

    @Test
    public void dodgemsIsHalfPriceIfUnder12() {
        visitor = new Visitor(10, 130, 20.00);
        assertEquals(2.25, dodgems.priceFor(visitor), 0.1);
    }

    @Test
    public void dodgemsIsDefaultPriceIfOver12() {
        visitor = new Visitor(19, 180, 40.00);
        assertEquals(4.50, dodgems.priceFor(visitor), 0.1);
    }
}
