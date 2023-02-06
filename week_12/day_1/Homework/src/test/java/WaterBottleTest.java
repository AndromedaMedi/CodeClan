import com.codeclan.homework.WaterBottle;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
public class WaterBottleTest {
    private WaterBottle bottle;

    @Before
    public void setup() { bottle = new WaterBottle(100); }

    @Test
    public void bottleHasVolume100() {
        assertEquals(100, bottle.getVolume());
    }

    @Test
    public void drinkReducesVolumeBy10() {
        assertEquals(90, bottle.drink());
    }

    @Test
    public void emptyBottle() {
        assertEquals(0, bottle.empty());
    }

    @Test
    public void fillBottle() {
        assertEquals(100, bottle.fill());
    }
}
