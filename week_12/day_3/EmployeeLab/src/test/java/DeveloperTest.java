import org.junit.Before;
import org.junit.Test;
import staff.techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    private Developer developer;

    @Before
    public void before(){
        developer = new Developer("John", "ABC", 1000.00);
    }

    @Test
    public void canRaiseSalary(){
        developer.raiseSalary(500.00);
        assertEquals(1500.0, developer.getSalary(), 0.1);
    }

    @Test
    public void canPayBonus(){
        developer.payBonus();
        assertEquals(10.0, developer.getSalary(), 0.1);
    }
}
