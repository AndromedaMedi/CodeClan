package vehicles;

import components.Doors;
import components.Engine;
import components.Tyres;

public abstract class Vehicle {

    private int price;
    private String colour;
    private Engine engine;
    private Doors doors;
    private Tyres tyres;

    public Vehicle(int price, String colour, Engine engine, Doors doors, Tyres tyres){
        this.price = price;
        this.colour = colour;
        this.engine = engine;
        this.doors = doors;
        this.tyres = tyres;
    }

    public int getPrice() {
        return this.price;
    }

    public String getColour() {
        return this.colour;
    }

    public Engine getEngine() {
        return engine;
    }

    public Doors getDoors() {
        return doors;
    }

    public Tyres getTyres() {
        return tyres;
    }

}
