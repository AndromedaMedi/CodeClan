package stock.instruments;

public class Drums extends Instrument {

    private String numOfDrums;

    public Drums(double boughtPrice, double sellPrice, String brand, String model, String material, String colour, InstrumentType type, String numOfDrums) {
        super(boughtPrice, sellPrice, brand, model, material, colour, type);
        this.numOfDrums = numOfDrums;
    }

    public String getNumOfDrums() {
        return numOfDrums;
    }

    @Override
    public String play(Instrument instrument) {
        return "Budum pshh";
    }
}
