import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RoomTest {

    Room room;

    @Before
    public void setup() {
        room = new Room(RoomType.DOUBLE);
    }

    @Test
    public void canGetRoomType() {
        assertEquals(RoomType.DOUBLE, room.getRoomType());
    }

    @Test
    public void doubleRoomHasValue2() {
        room = new Room(RoomType.DOUBLE);
        assertEquals(2, room.getValueFromEnum());
    }
    @Test
    public void familyRoomHasCapacity5() {
        room = new Room(RoomType.FAMILY);
        assertEquals(5, room.getCapacityFromEnum());
    }

}
