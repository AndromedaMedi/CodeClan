package attractions;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ParkTest {

    public Park park;

    @Before
    public void before() {
        park = new Park("Sunny Hill", 10);
    }

    @Test
    public void parkHasName() {
        assertEquals("Sunny Hill", park.getName());
    }

    @Test
    public void parkHasRating() {
        assertEquals(10, park.getRating());
    }

}
