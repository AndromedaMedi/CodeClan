import components.Doors;
import components.Engine;
import components.Tyres;
import org.junit.Before;
import org.junit.Test;
import vehicles.Car;
import vehicles.Vehicle;

import static org.junit.Assert.assertEquals;

public class DealershipTest {

    Dealership dealership;
    Vehicle vehicle;
    Engine engine;
    Doors doors;
    Tyres tyres;
    Customer customer;

    @Before
    public void before() {
        dealership = new Dealership(50000);
        vehicle = new Car(10000, "red", engine, doors, tyres);
        customer = new Customer(12000);
    }

    @Test
    public void canBuyVehicles() {
        dealership.buy(vehicle);
        assertEquals(1, dealership.getStockCount());
    }

    @Test
    public void canSellVehicles() {
        dealership.buy(vehicle);
        dealership.buy(vehicle);
        dealership.buy(vehicle);
        dealership.sell(vehicle, customer);
        assertEquals(2, dealership.getStockCount());
        assertEquals(1, customer.getOwnedVehicleCount());
    }
}
