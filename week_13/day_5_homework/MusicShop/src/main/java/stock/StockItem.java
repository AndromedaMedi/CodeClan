package stock;

import behaviours.ISell;

public abstract class StockItem implements ISell {

    public double boughtPrice;
    public double sellPrice;

    public StockItem(double boughtPrice, double sellPrice) {
        this.boughtPrice = boughtPrice;
        this.sellPrice = sellPrice;
    }

    public double getBoughtPrice() {
        return boughtPrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    @Override
    public double calculateMarkup() {
        return sellPrice - boughtPrice;
    }

}
