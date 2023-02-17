import behaviours.ISell;
import stock.StockItem;

import java.util.ArrayList;

public class MusicShop {

    private ArrayList<StockItem> stock;

    public MusicShop(ArrayList<StockItem> stock) {
        this.stock = new ArrayList<StockItem>();
    }


    public ArrayList<StockItem> getStock() {
        return stock;
    }

    public int getStockCount() {
        return stock.size();
    }

    void addToStock(StockItem stockItem) {
        this.stock.add(stockItem);
    }

    void removeFromStock(ISell stockItem) {
        this.stock.remove(stockItem);
    }

    public double calculateMarkup() {
        double total = 0;
        for (ISell stockItem : stock){
            total += stockItem.calculateMarkup();
        }
        return total;
    }
}
