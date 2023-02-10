import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    Bedroom bedroom;
    Guest guest;


    @Before
    public void before(){
        bedroom = new Bedroom(RoomType.DOUBLE, 6);

    }

    @Test
    public void bedroomHasACapacity(){
        assertEquals(2, bedroom.getCapacityFromEnum());
    }

    @Test
    public void bedroomHasRoomNumber() {
        assertEquals(6, bedroom.getRoomNum());
    }

    @Test
    public void bedroomStartsEmpty() {
        assertEquals(0, bedroom.getNumberOfGuests());
    }

    @Test
    public void canAddGuestsToBedroom() {
        bedroom.addGuest(guest);
        assertEquals(1, bedroom.getNumberOfGuests());
    }

    @Test
    public void canRemoveGuestFromBedroom() {
        bedroom.addGuest(guest);
        bedroom.removeGuest(guest);
        assertEquals(0, bedroom.getNumberOfGuests());
    }


}
