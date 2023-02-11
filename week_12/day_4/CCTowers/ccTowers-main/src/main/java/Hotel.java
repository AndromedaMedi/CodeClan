import java.util.ArrayList;
import java.util.HashMap;

public class Hotel {

    private ArrayList<Room> bedrooms;
    private ArrayList<Room> confRooms;

    private HashMap<String, DiningRoom> diningRooms;

    Booking booking ;


    public Hotel() {
        this.bedrooms = new ArrayList<>();
        this.confRooms = new ArrayList<>();
        diningRooms = new HashMap<>();
    }

//    public void addDiningRoom(DiningRoom diningRoom) {
//        diningRoom.put(diningRoom.getName(), diningRooms);
//    }

    public DiningRoom getDiningRoom(String diningRoomName) {
        return diningRooms.get(diningRoomName);
    }

    public void addGuestToRoom(Room room, Guest guest) {
        room.addGuest(guest);
    }

    public Booking bookRoom(Bedroom bedroom, int numNights) {
         booking = new Booking(bedroom, numNights);
         return booking;
    }

    public int checkout(Booking booking) {
        return booking.getTotal();
    }


}
