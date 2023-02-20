import behaviours.ISell;
import stock.StockItem;

import java.util.ArrayList;
import java.util.stream.Stream;

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

    public double calculateTotalMarkup() {
        double total = 0;
        for (ISell stockItem : stock){
            total += stockItem.calculateMarkup();
        }
        return total;
    }

//    public double calculateMarkup() {
//        return stock.stream()
//                .map(ISell
//                .map(sellable -> sellable.calculateMarkup())
//                .reduce(0, double::sum));
//    }
}
