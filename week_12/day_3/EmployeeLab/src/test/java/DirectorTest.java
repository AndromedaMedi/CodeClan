import org.junit.Before;
import org.junit.Test;
import staff.management.Director;


import static org.junit.Assert.assertEquals;

public class DirectorTest {

    private Director director;

    @Before
    public void before(){
        director = new Director("John", "ABC", 1000.00, "HR", 20000.00);
    }

    @Test
    public void managerHasDepName(){
        assertEquals("HR", director.getDepName());
    }

    @Test
    public void canRaiseSalary(){
        director.raiseSalary(500.00);
        assertEquals(1500.00, director.getSalary(), 0.1);
    }

    @Test
    public void canPayBonus(){
        assertEquals(20.00, director.payBonus(), 0.1);
    }
}
