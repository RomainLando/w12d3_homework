import org.junit.Before;
import org.junit.Test;
import staff.techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before(){
        developer = new Developer("Sara", 2134567, 40000);
    }

    @Test
    public void hasName(){
        assertEquals("Sara", developer.getName());
    }

    @Test
    public void hasNiNumber(){
        assertEquals(2134567, developer.getNiNumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(40000, developer.getSalary(), 0.00);
    }

    @Test
    public void canIncrementSalary(){
        developer.raiseSalary(5000);
        assertEquals(45000, developer.getSalary(), 0.00);
    }

    @Test
    public void canCalculatePayBonus(){
        assertEquals(400,developer.getPayBonus(), 0.0);
    }
}
