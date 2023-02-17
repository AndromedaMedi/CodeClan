package stock.accessories;

import stock.StockItem;

public abstract class Accessory extends StockItem {

    private String description;

    public Accessory(double boughtPrice, double sellPrice, String description) {
        super(boughtPrice, sellPrice);
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
