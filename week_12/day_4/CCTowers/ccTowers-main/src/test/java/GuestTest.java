import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuestTest {

    Guest guest;

    @Before
    public void before() {
        guest = new Guest("Thom");
    }

    @Test
    public void guestHasAName(){
        assertEquals("Thom", guest.getName());
    }
}
