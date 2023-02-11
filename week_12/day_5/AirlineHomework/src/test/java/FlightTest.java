import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    private Flight flight;
    private Pilot pilot;
    private CabinCrewMember member;
    private Passenger passenger;
    private Plane plane;


    @Before
    public void before() {
        pilot = new Pilot("JackJones", CabinCrewMemberRank.CAPTAIN);
        member = new CabinCrewMember("Mary Jane", CabinCrewMemberRank.FLIGHT_ATTENDANT);
        passenger = new Passenger("John Doe", 2);
        plane = new Plane(PlaneType.BOEING_747);
        flight = new Flight(pilot, plane,"FR756", "EDI", "GLA", "08:20");
    }

    @Test
    public void flightHasPilot() {
        assertEquals(pilot, flight.getPilot());
    }

    @Test
    public void flightCanAddCabinCrewMember() {
        flight.addCabinCrewMember(member);
        assertEquals(1, flight.getCrew());
    }

    @Test
    public void flightCanAddPassenger() {
        flight.addPassenger(passenger);
        assertEquals(1, flight.getPassengers());
    }

    @Test
    public void flightHasPlane() {
        assertEquals(plane, flight.getPlane());
    }

    @Test
    public void flightHasFlightNumber() {
        assertEquals("FR756", flight.getFlightNumber());
    }

    @Test
    public void flightHasDestination() {
        assertEquals("EDI", flight.getDestination());
    }

    @Test
    public void flightHasDepartureAirport() {
        assertEquals("GLA", flight.getDepartureAirport());
    }

    @Test
    public void flightHasDepartureTime() {
        assertEquals("08:20", flight.getDepartureTime());
    }

    @Test
    public void flightCanGetNumOfAvailableSeats() {
        flight.addPassenger(passenger);
        flight.addPassenger(passenger);
        flight.addPassenger(passenger);
        flight.addPassenger(passenger);
        flight.addPassenger(passenger);
        assertEquals(75, flight.getAvailableSeats());
    }

    @Test
    public void cannotAddPassengerIfFlightIsFull() {
        plane = new Plane(PlaneType.BOEING_CO);
        flight = new Flight(pilot, plane,"KL480", "STN", "ATH", "15:30");
        flight.addPassenger(passenger);
        flight.addPassenger(passenger);
        flight.addPassenger(passenger);
        flight.addPassenger(passenger);
        flight.addPassenger(passenger);
        flight.addPassenger(passenger);
        assertEquals(5, flight.getPassengers());
    }

    @Test
    public void canAddPassengerOnlyIfSeatsAvailable() {
        plane = new Plane(PlaneType.BOEING_CO);
        flight = new Flight(pilot, plane,"KL480", "STN", "ATH", "15:30");
        flight.addPassenger(passenger);
        flight.addPassenger(passenger);
        flight.addPassenger(passenger);
        flight.addPassenger(passenger);
        flight.addPassenger(passenger);
        flight.addPassengerIfSeatsAvail(passenger);
        assertEquals(5, flight.getPassengers());
    }
}
