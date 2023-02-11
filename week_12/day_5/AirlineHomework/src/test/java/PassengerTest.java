import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.assertEquals;

public class PassengerTest {

    Passenger passenger;

    @Before
    public void before() {
        passenger = new Passenger("John Doe", 2);
    }

    @Test
    public void passengerHasName() {
        assertEquals("John Doe", passenger.getName());
    }

    @Test
    public void passengerHasBags() {
        assertEquals(2, passenger.getBags());
    }
}
