import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class VisitorTest {

    private Visitor visitor;

    @Before
    public void before() {
        visitor = new Visitor(25, 175, 50.00);
    }

    @Test
    public void visitorHasAge() {
        assertEquals(25, visitor.getAge());
    }

    @Test
    public void visitorHasHeight() {
        assertEquals(175, visitor.getHeight());
    }

    @Test
    public void visitorHasMoney() {
        assertEquals(50.00, visitor.getMoney(), 0.1);
    }
}
