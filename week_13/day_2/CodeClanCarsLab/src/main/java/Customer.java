import behaviours.IBuy;
import vehicles.Vehicle;

import java.util.ArrayList;

public class Customer implements IBuy {

    private int money;
    private ArrayList<Vehicle> ownedVehicles;

    public Customer(int money) {
        this.money = money;
        this.ownedVehicles = new ArrayList<>();
    }

    public int getMoney() {
        return this.money;
    }

    public ArrayList<Vehicle> getOwnedVehicles() {
        return ownedVehicles;
    }

    public int getOwnedVehicleCount() {
        return ownedVehicles.size();
    }

    @Override
    public void buy(Vehicle vehicle) {
        ownedVehicles.add(vehicle);
        this.money -= vehicle.getPrice();
    }
}
