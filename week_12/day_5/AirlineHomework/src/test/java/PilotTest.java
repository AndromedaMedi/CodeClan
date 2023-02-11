import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PilotTest {

    private Pilot pilot;

    @Before
    public void before() {
        pilot = new Pilot("Jack Jones", CabinCrewMemberRank.CAPTAIN);
    }

    @Test
    public void pilotHasName() {
        assertEquals("Jack Jones", pilot.getName());
    }

    @Test
    public void canGetPilotRankFromEnum() {
        assertEquals(CabinCrewMemberRank.CAPTAIN, pilot.getRank());
    }

    @Test
    public void pilotCanFlyThePlane() {
        assertEquals("I love flying!", pilot.fly());
    }
}
