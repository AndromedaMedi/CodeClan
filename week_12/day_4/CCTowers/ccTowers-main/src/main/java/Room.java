import java.util.ArrayList;

public abstract class Room {

    private RoomType roomType;
    private ArrayList<Guest> guests;

    public Room(RoomType roomType) {
        this.roomType = roomType;
        this.guests = new ArrayList<>();
    }

    public RoomType getRoomType(){
        return roomType;
    }

    public int getCapacityFromEnum(){
        return roomType.getCapacity();
    }

    public int getNumberOfGuests() {
        return guests.size();
    }

    public void addGuest(Guest guest) {
        guests.add(guest);
    }

    public void removeGuest(Guest guest) {
        guests.remove(guest);
    }

    public int getRate() {
        return roomType.getRate();
    }
}
