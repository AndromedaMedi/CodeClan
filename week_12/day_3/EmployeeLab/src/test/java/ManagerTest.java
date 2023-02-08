import org.junit.Before;
import org.junit.Test;
import staff.management.Manager;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    private Manager manager;

    @Before
    public void before(){
        manager = new Manager("John", "ABC", 1000.00, "HR");
    }

    @Test
    public void managerHasDepName(){
        assertEquals("HR", manager.getDepName());
    }

    @Test
    public void canRaiseSalary(){
        manager.raiseSalary(500.00);
        assertEquals(1500.00, manager.getSalary(), 0.1);
    }

    @Test
    public void canPayBonus(){
        manager.payBonus();
        assertEquals(10.00, manager.payBonus(), 0.1);
    }
}
