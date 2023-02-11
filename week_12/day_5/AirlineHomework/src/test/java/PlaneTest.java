import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    private Plane plane;

    @Before
    public void before() {
        plane = new Plane(PlaneType.BOEING_747);
    }

    @Test
    public void canGetPlaneTypeFromEnum() {
        assertEquals(PlaneType.BOEING_747, plane.getPlaneType());
    }

    @Test
    public void canGetPlaneCapacityFromEnum() {
        assertEquals(80, plane.getPlaneCapacity());
    }

    @Test
    public void canGetPlaneWeightFromEnum() {
        assertEquals(100.0, plane.getPlaneWeight(), 0.0);
    }
}
