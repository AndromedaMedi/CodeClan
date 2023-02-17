package stock;

import org.junit.Before;
import org.junit.Test;
import stock.accessories.Accessory;
import stock.accessories.DrumSticks;
import stock.accessories.GuitarStrings;
import stock.accessories.SheetMusic;

import static org.junit.Assert.assertEquals;

public class AccessoriesTest {

    Accessory accessory1;
    Accessory accessory2;
    Accessory accessory3;

    @Before
    public void setup() {
        accessory1 = new DrumSticks(1.00, 2.50, "5A Wood Tip Drumsticks");
        accessory2 = new GuitarStrings(5.00, 18.00, "Elixir Nanoweb Acoustic Guitar Strings-Medium");
        accessory3 = new SheetMusic(4.00,19.00, "Tunes You've Always Wanted To Play");
    }

    @Test
    public void drumsticksHaveBoughtPrice() {
        assertEquals(1.00, accessory1.getBoughtPrice(), 0.1);
    }

    @Test
    public void guitarStringsHaveSellPrice() {
        assertEquals(18.00, accessory2.getSellPrice(), 0.1);
    }

    @Test
    public void sheetMusicHasDescription() {
        assertEquals("Tunes You've Always Wanted To Play", accessory3.getDescription());
    }
}
