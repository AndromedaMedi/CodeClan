import java.util.ArrayList;
import java.util.Collection;

public abstract class Room {
    private int capacity;

    private ArrayList<Guest> guests;

    public Room(int capacity) {
        this.capacity = capacity;
        this.guests = new ArrayList<>();

    }

    public int getCapacity() {
        return capacity;
    }

    public ArrayList<Guest> getGuests() {
        return this.guests;
    }

    public void addGuest(Guest guest) {
        this.guests.add(guest);
    }

    public void removeGuest(Guest guest) {
        this.guests.remove(guest);
    }
}
