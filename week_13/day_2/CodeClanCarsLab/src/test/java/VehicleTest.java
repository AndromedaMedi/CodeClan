import components.Doors;
import components.Engine;
import components.Tyres;
import org.junit.Before;
import org.junit.Test;
import vehicles.Car;
import vehicles.Vehicle;

import static org.junit.Assert.assertEquals;

public class VehicleTest {

    private Vehicle vehicle;
    private Engine engine;
    private Doors doors;
    private Tyres tyres;

    @Before
    public void before() {
        engine = new Engine("5l");
        vehicle = new Car(10000, "red", engine, doors, tyres);
    }

    @Test
    public void vehicleHasEngineThroughVehicleComposition() {
        assertEquals("5l", vehicle.getEngine());
    }
}
