import java.util.ArrayList;

public class Bus {

    private String destination;
    private int capacity;
    private ArrayList<Person> passengers;

    public Bus(String destination, int capacity) {
        this.destination = destination;
        this.capacity = capacity;
        this.passengers = new ArrayList<>();
    }

    public int getPassengerCount() {
        return this.passengers.size();
    }

    public void addPassenger(Person person) {
        if (getPassengerCount() == this.capacity) {
        } else {
            passengers.add(person);
        }
    }

    public void removePassenger(Person person) {
        passengers.remove(person);
    }

    public void pickUp(BusStop busStop, Person person) {
        busStop.removeFromQueue(person);
        this.passengers.add(person);
    }
}
