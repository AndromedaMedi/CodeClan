package stock;

import org.junit.Before;
import org.junit.Test;
import stock.instruments.*;

import static org.junit.Assert.assertEquals;

public class InstrumentsTest {

    Guitar guitar;
    Drums drums;
    Piano piano;
    Trumpet trumpet;

    @Before
    public void setup() {
        guitar = new Guitar(2500.00, 3500.00, "Gibson", "Hummingbird Vintage Sunburst", "wood", "black/brown", InstrumentType.STRING, "6");
        drums = new Drums(600.00, 1100.00, "Tama", "Superstar Classic", "maple wood", "brown", InstrumentType.PERCUSSION, "5");
        piano = new Piano(50000.00, 90000.00, "Bosendorfer", "170", "mix woods", "black", InstrumentType.KEYS);
        trumpet = new Trumpet(80.00, 120.00, "Monzani", "MZTR-113A", "brass", "gold", InstrumentType.BRASS, "3");
    }

    @Test
    public void guitarHasBuyAndSellPrice() {
        assertEquals(2500.00, guitar.getBoughtPrice(), 0.1);
        assertEquals(3500.00, guitar.getSellPrice(), 0.1);
    }

    @Test
    public void guitarHasBrandAndModel() {
        assertEquals("Gibson", guitar.getBrand());
        assertEquals("Hummingbird Vintage Sunburst", guitar.getModel());
    }

    @Test
    public void guitarHasMaterialAndColour() {
        assertEquals("wood", guitar.getMaterial());
        assertEquals("black/brown", guitar.getColour());
    }

    @Test
    public void guitarHasType() {
        assertEquals(InstrumentType.STRING, guitar.getType());
    }

    @Test
    public void guitarHasNumOfStrings() {
        assertEquals("6", guitar.getNumOfStrings());
    }

    @Test
    public void guitarCanPlay() {
        assertEquals("Love the sound of the guitar!", guitar.play(guitar));
    }

    @Test
    public void drumsCanPlay() {
        assertEquals("Budum pshh", drums.play(drums));
    }

    @Test
    public void pianoCanPlay() {
        assertEquals("Love playing the piano!", piano.play(piano));
    }

    @Test
    public void trumpetCanPlay() {
        assertEquals("Playing the trumpet is tough!", trumpet.play(trumpet));
    }
}
