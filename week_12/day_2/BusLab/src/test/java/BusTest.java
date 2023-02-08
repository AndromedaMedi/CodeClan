import com.sun.istack.internal.NotNull;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class BusTest {

    private Bus bus;
    private Person person;

    private BusStop busStop;

    @Before
    public void before() {
        bus = new Bus("Glasgow", 3);
    }

    @Test
    public void canGetPassengerCount() {
        assertEquals(0, bus.getPassengerCount());
    }

    @Test
    public void canAddPassenger() {
        bus.addPassenger(person);
        assertEquals(1, bus.getPassengerCount());
    }

    @Test
    public void busCanTakePassengers() {
        bus.addPassenger(person);
        bus.addPassenger(person);
        assertEquals(2, bus.getPassengerCount());
    }

    @Test
    public void busIsFull() {
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        assertEquals(3, bus.getPassengerCount());
    }

    @Test
    public void canRemovePassenger() {
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.removePassenger(person);
        assertEquals(2, bus.getPassengerCount());
    }

    @Test
    public void busCanPickUpPassengers() {
        bus.pickUp(busStop, person);
        assertEquals(1, bus.getPassengerCount());
    }


}
