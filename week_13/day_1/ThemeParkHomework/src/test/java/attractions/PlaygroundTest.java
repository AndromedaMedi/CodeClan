package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class PlaygroundTest {

    private Playground playground;
    private Visitor visitor;

    @Before
    public void before() {
        playground = new Playground("Monkey Pit", 5);
    }

    @Test
    public void playgroundHasName() {
        assertEquals("Monkey Pit", playground.getName());
    }

    @Test
    public void playgroundHasRating() {
        assertEquals(5, playground.getRating());
    }

    @Test
    public void playgroundHasVisitorCount() {
        assertEquals(0, playground.getVisitCount());
    }

    @Test
    public void visitorNotAllowedIfOver15() {
        visitor = new Visitor(22, 170, 50.0);
        assertEquals(false, playground.isAllowed(visitor));
    }

    @Test
    public void visitorAllowedIfUnder15() {
        visitor = new Visitor(8, 100, 20.0);
        assertEquals(true, playground.isAllowed(visitor));
    }
}
