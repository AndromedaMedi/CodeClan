import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CabinCrewMemberTest {

    private CabinCrewMember member;

    @Before
    public void before() {
        member = new CabinCrewMember("Mary Jane", CabinCrewMemberRank.FLIGHT_ATTENDANT);
    }

    @Test
    public void crewMemberHasName() {
        assertEquals("Mary Jane", member.getName());
    }

    @Test
    public void canGetCrewMemberRankFromEnum() {
        assertEquals(CabinCrewMemberRank.FLIGHT_ATTENDANT, member.getRank());
    }

    @Test
    public void canSpeakToPassengers() {
        assertEquals("Welcome to our flight!", member.speakToPassengers());
    }
}
