import behaviours.ISell;
import org.junit.Before;
import org.junit.Test;
import stock.StockItem;
import stock.accessories.DrumSticks;
import stock.accessories.GuitarStrings;
import stock.instruments.Guitar;
import stock.instruments.InstrumentType;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class MusicShopTest {

    MusicShop musicShop;
    StockItem stockItem1;
    StockItem stockItem2;
    StockItem stockItem3;
    StockItem stockItem4;

    @Before
    public void setup() {
        stockItem1 = new Guitar(2500.00, 3500.00, "Gibson", "Hummingbird Vintage Sunburst", "wood", "black/brown", InstrumentType.STRING, "6");
        stockItem2 = new GuitarStrings(5.00, 18.00, "Elixir Nanoweb Acoustic Guitar Strings-Medium");
        stockItem3 = new GuitarStrings(5.00, 18.00, "Elixir Nanoweb Acoustic Guitar Strings-Medium");
        stockItem4 = new DrumSticks(1.00, 2.50, "5A Wood Tip Drumsticks");
        ArrayList<StockItem> stock = new ArrayList<StockItem>();
        musicShop = new MusicShop(stock);
    }

    @Test
    public void shopCanBuyStock() {
        musicShop.addToStock(stockItem1);
        assertEquals(1, musicShop.getStockCount());
    }

    @Test
    public void shopCanSellStock() {
        musicShop.addToStock(stockItem1);
        musicShop.addToStock(stockItem2);
        musicShop.removeFromStock(stockItem1);
        assertEquals(1, musicShop.getStockCount());
    }

    @Test
    public void shopCanGetTotalMarkup() {
        musicShop.addToStock(stockItem1);
        musicShop.addToStock(stockItem2);
        musicShop.addToStock(stockItem3);
        musicShop.addToStock(stockItem4);
        assertEquals(1027.50, musicShop.calculateTotalMarkup(), 0.1);
    }


}
