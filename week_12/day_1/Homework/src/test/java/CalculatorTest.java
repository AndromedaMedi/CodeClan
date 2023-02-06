
import com.codeclan.homework.Calculator;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    @Test
    public void add() {
        Calculator result = new Calculator();
        assertEquals(8, result.add(4,4));
    }
    @Test
    public void subtract() {
        Calculator result = new Calculator();
        assertEquals(3, result.subtract(9,6));
    }

    @Test
    public void multiply() {
        Calculator result = new Calculator();
        assertEquals(24, result.multiply(3,8));
    }

    @Test
    public void divide() {
        Calculator result = new Calculator();
        assertEquals(3, result.divide(9.0,3.0), 0.0);
    }
}




