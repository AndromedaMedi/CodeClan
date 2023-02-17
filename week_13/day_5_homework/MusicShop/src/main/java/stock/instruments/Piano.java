package stock.instruments;

public class Piano extends Instrument {


    public Piano(double boughtPrice, double sellPrice, String brand, String model, String material, String colour, InstrumentType type) {
        super(boughtPrice, sellPrice, brand, model, material, colour, type);

    }

    @Override
    public String play(Instrument instrument) {
        return "Love playing the piano!";
    }
}
