import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusStopTest {

    private BusStop busStop;
    private Person person;

    @Before
    public void before() {
        busStop = new BusStop("Central Station");
    }

    @Test
    public void getQueueCount() {
        assertEquals(0, busStop.getQueueCount());
    }

    @Test
    public void canAddPersonToQueue() {
        busStop.addToQueue(person);
        assertEquals(1, busStop.getQueueCount());
    }

    @Test
    public void canRemovePersonFromQueue() {
        busStop.addToQueue(person);
        busStop.addToQueue(person);
        busStop.addToQueue(person);
        busStop.removeFromQueue(person);
        assertEquals(2, busStop.getQueueCount());

    }
}
