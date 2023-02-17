package stock.instruments;

public class Guitar extends Instrument {

    private String numOfStrings;

    public Guitar(double boughtPrice, double sellPrice, String brand, String model, String material, String colour, InstrumentType type, String numOfStrings) {
        super(boughtPrice, sellPrice, brand, model, material, colour, type);
        this.numOfStrings = numOfStrings;
    }

    public String getNumOfStrings() {
        return numOfStrings;
    }

    @Override
    public String play(Instrument instrument) {
        return "Love the sound of the guitar!";
    }
}
