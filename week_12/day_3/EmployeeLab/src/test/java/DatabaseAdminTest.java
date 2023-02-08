import org.junit.Before;
import org.junit.Test;
import staff.techStaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    private DatabaseAdmin databaseAdmin;

    @Before
    public void before(){
        databaseAdmin = new DatabaseAdmin("John", "ABC", 1000.00);
    }

    @Test
    public void canRaiseSalary(){
        databaseAdmin.raiseSalary(500.00);
        assertEquals(1500.00, databaseAdmin.getSalary(), 0.1);
    }

    @Test
    public void canPayBonus(){
        databaseAdmin.payBonus();
        assertEquals(10.00, databaseAdmin.getSalary(), 0.1);
    }
}
