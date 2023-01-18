import org.junit.Before;
import org.junit.Test;
import staff.management.Director;
import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before() {
        director = new Director("Agnes", 1234576, 50000, "R&D", 3000000);
    }

    @Test
    public void hasName(){
        assertEquals("Agnes", director.getName());
    }

    @Test
    public void hasNiNumber(){
        assertEquals(1234576, director.getNiNumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(50000, director.getSalary(), 0.00);
    }

    @Test
    public void hasDeptName(){
        assertEquals("R&D", director.getDeptName());
    }

    @Test
    public void hasBudget(){
        assertEquals(3000000, director.getBudget(), 0.0);
    }

    @Test
    public void canIncrementSalary(){
        director.raiseSalary(5000);
        assertEquals(55000, director.getSalary(), 0.00);
    }

    @Test
    public void canCalculatePayBonus(){
        assertEquals(1000,director.getPayBonus(), 0.0);
    }
}
