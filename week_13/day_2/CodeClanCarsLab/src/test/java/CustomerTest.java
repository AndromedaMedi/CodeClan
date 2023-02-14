import components.Doors;
import components.Engine;
import components.Tyres;
import org.junit.Before;
import org.junit.Test;
import vehicles.Car;
import vehicles.Vehicle;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    Customer customer;
    Vehicle vehicle;
    Engine engine;
    Doors doors;
    Tyres tyres;

    @Before
    public void before() {
        customer = new Customer(20000);
        vehicle = new Car(10000, "red", engine, doors, tyres);
    }

    @Test
    public void canBuyVehicle() {
        customer.buy(vehicle);
        assertEquals(1, customer.getOwnedVehicleCount());
        assertEquals(10000, customer.getMoney());
    }
}
