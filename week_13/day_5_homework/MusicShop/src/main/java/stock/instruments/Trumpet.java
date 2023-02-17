package stock.instruments;

public class Trumpet extends Instrument {

    private String numOfValves;

    public Trumpet(double boughtPrice, double sellPrice, String brand, String model, String material, String colour, InstrumentType type, String numOfValves) {
        super(boughtPrice, sellPrice, brand, model, material, colour, type);
        this.numOfValves = numOfValves;
    }

    public String getNumOfValves() {
        return numOfValves;
    }

    @Override
    public String play(Instrument instrument) {
        return "Playing the trumpet is tough!";
    }
}
