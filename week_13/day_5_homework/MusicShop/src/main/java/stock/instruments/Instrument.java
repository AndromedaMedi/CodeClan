package stock.instruments;
import behaviours.IPlay;
import stock.StockItem;

import java.lang.reflect.Type;

public abstract class Instrument extends StockItem implements IPlay {

    private String brand;
    private String model;
    private String material;
    private String colour;
    private InstrumentType type;

    public Instrument(double boughtPrice, double sellPrice, String brand, String model, String material, String colour, InstrumentType type) {
        super(boughtPrice, sellPrice);
        this.brand = brand;
        this.model = model;
        this.material = material;
        this.colour = colour;
        this.type = type;

    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getMaterial() {
        return material;
    }

    public String getColour() {
        return colour;
    }

    public InstrumentType getType() {
        return type;
    }

    public double getBoughtPrice() {
        return boughtPrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }
}
