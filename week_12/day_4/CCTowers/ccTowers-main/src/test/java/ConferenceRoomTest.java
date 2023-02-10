import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    ConferenceRoom conferenceRoom;

    @Before
    public void before(){
        conferenceRoom = new ConferenceRoom(RoomType.LARGE_CONFERENCE, "Blue");
    }

    @Test
    public void conferenceRoomHasACapacity(){
        assertEquals(100, conferenceRoom.getCapacityFromEnum());
    }

    @Test
    public void ConferenceRoomHasAName() {
        assertEquals("Blue", conferenceRoom.getName());
    }


}
