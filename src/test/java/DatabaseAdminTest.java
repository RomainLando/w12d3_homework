import org.junit.Before;
import org.junit.Test;
import staff.techStaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void before(){
        databaseAdmin = new DatabaseAdmin("Liam", 3124567, 60000);
    }

    @Test
    public void hasName(){
        assertEquals("Liam", databaseAdmin.getName());
    }

    @Test
    public void hasNiNumber(){
        assertEquals(3124567, databaseAdmin.getNiNumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(60000, databaseAdmin.getSalary(), 0.00);
    }

    @Test
    public void canIncrementSalary(){
        databaseAdmin.raiseSalary(5000);
        assertEquals(65000, databaseAdmin.getSalary(), 0.00);
    }

    @Test
    public void canCalculatePayBonus(){
        assertEquals(600,databaseAdmin.getPayBonus(), 0.0);
    }
}
