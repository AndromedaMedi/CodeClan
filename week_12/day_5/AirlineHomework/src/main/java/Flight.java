import java.util.ArrayList;

public class Flight {

    private Pilot pilot;
    private ArrayList<CabinCrewMember> members;
    private ArrayList<Passenger> passengers;
    private Plane plane;
    private String flightNumber;
    private String destination;
    private String departureAirport;
    private String departureTime;

    public Flight(Pilot pilot, Plane plane, String flightNumber, String destination, String departureAirport, String departureTime) {
        this.pilot = pilot;
        this.members = new ArrayList<>();
        this.passengers = new ArrayList<>();
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
    }
    public Pilot getPilot() {
        return pilot;
    }

    public int getCrew() {
        return members.size();
    }

    public void addCabinCrewMember(CabinCrewMember member){
        this.members.add(member);
    }

    public int getPassengers() {
        return passengers.size();
    }

    public void addPassenger(Passenger passenger){
        if (passengers.size() == plane.getPlaneCapacity()) {
        } else {
            this.passengers.add(passenger);
        }

    }

    public Plane getPlane() {
        return plane;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getDestination() {
        return destination;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public int getAvailableSeats() {
        int bookedPassengers = this.passengers.size();
        int availableSeats = plane.getPlaneCapacity() - bookedPassengers;
        return availableSeats;
    }

    public void addPassengerIfSeatsAvail(Passenger passenger) {
        if (getAvailableSeats() == 0) {
        } else {
            this.passengers.add(passenger);
        }
    }

}
