import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    Hotel hotel;
    Guest guest1;
    Guest guest2;
    Bedroom bedroom;
    ConferenceRoom conferenceRoom;

    @Before
    public void before(){
        hotel = new Hotel();
        guest1 = new Guest("Thom");
        guest2 = new Guest("Andrew");
        bedroom = new Bedroom(RoomType.SINGLE, 2);
        conferenceRoom = new ConferenceRoom(RoomType.SMALL_CONFERENCE, "Rose Room");
    }
    @Test
    public void hotelCanAddGuestToARoom() {
        hotel.addGuestToRoom(bedroom, guest1);
        assertEquals(1, bedroom.getNumberOfGuests());
    }



}
