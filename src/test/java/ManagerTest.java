import org.junit.Before;
import org.junit.Test;
import staff.management.Manager;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before() {
        manager = new Manager("Agnes", 1234576, 50000, "R&D");
    }

    @Test
    public void hasName(){
        assertEquals("Agnes", manager.getName());
    }

    @Test
    public void hasNiNumber(){
        assertEquals(1234576, manager.getNiNumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(50000, manager.getSalary(), 0.00);
    }

    @Test
    public void hasDeptName(){
        assertEquals("R&D", manager.getDeptName());
    }

    @Test
    public void canIncrementSalary(){
        manager.raiseSalary(5000);
        assertEquals(55000, manager.getSalary(), 0.00);
    }

    @Test
    public void canCalculatePayBonus(){
        assertEquals(500,manager.getPayBonus(), 0.0);
    }
}
