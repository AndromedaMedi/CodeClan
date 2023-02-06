import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BearTest {
    private Bear bear;

    @Before
    public void setup() {
        bear = new Bear("Baloo", 25, 95.62, 'f');
    }

    @Test
    public void bearHasName() {
        assertEquals("Baloo", bear.getName());
    }

    @Test
    public void bearHasAge() {
        assertEquals(25, bear.getAge());
    }

    @Test
    public void bearHasWeight() {
        assertEquals(95.62, bear.getWeight(), 0.0);
    }

    @Test
    public void bearIsReadyToHibernateIfGreaterThan80() {
        assertEquals(true, bear.readyToHibernate());
    }

    @Test
    public void bearIsNotReadyToHibernateIfGreaterThan80() {
        Bear lightBear = new Bear("Baloo", 12, 75.00, 'f');
        assertEquals(false, lightBear.readyToHibernate());
    }

    @Test
    public void bearHasSex() {
        assertEquals('f', bear.getSex());
    }

}
