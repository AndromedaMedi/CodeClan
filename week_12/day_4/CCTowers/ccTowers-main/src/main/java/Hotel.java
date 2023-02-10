import java.util.ArrayList;

public class Hotel {

    private ArrayList<Room> bedrooms;
    private ArrayList<Room> confRooms;

    Booking booking ;


    public Hotel() {
        this.bedrooms = new ArrayList<>();
        this.confRooms = new ArrayList<>();
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
