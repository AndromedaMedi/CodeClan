package vehicles;

import components.Doors;
import components.Engine;
import components.Tyres;

public class Car extends Vehicle {

    public Car(int price, String colour, Engine engine, Doors doors, Tyres tyres) {
        super(price, colour, engine, doors, tyres);
    }
}
