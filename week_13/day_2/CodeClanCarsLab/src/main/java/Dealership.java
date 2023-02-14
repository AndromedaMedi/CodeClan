import behaviours.IBuy;
import components.Engine;
import vehicles.HybridCar;
import vehicles.Vehicle;

import java.util.ArrayList;

public class Dealership implements IBuy {

    private ArrayList<Vehicle> stock;
    private int till;

    public Dealership(int till) {
        this.till = till;
        this.stock = new ArrayList<>();
    }

    public int getTill() {
        return till;
    }

    public ArrayList<Vehicle> getStock() {
        return stock;
    }

    public int getStockCount() {
        return stock.size();
    }

    @Override
    public void buy(Vehicle vehicle) {
        stock.add(vehicle);
    }

    public void sell(Vehicle vehicle, Customer customer) {
        stock.remove(vehicle);
        customer.buy(vehicle);
    }
}
