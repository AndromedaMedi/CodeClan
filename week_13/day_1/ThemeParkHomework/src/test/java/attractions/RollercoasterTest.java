package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    Rollercoaster rollercoaster;

    Visitor visitor;

    @Before
    public void before() {
        rollercoaster = new Rollercoaster("Red Dragon", 8);
    }

    @Test
    public void rollercoasterHasName() {
        assertEquals("Red Dragon", rollercoaster.getName());
    }

    @Test
    public void rollercoasterHasRating() {
        assertEquals(8, rollercoaster.getRating());
    }

    @Test
    public void rollercoasterHasVisitorCount() {
        assertEquals(0, rollercoaster.getVisitCount());
    }

    @Test
    public void rollercoasterHasDefaultPrice() {
        assertEquals(8.40, rollercoaster.defaultPrice(8.40));
    }

    @Test
    public void rollercoasterIsDoublePriceForOver200cm() {
        visitor = new Visitor(23, 210, 60.00);
        assertEquals(16.80, rollercoaster.priceFor(visitor), 0.1);
    }

    @Test
    public void rollercoasterIsDefaultPriceForUnder100cm() {
        visitor = new Visitor(14, 155, 30.00);
        assertEquals(8.40, rollercoaster.priceFor(visitor), 0.1);
    }
}
