import org.junit.Before;
import org.junit.Test;
import staff.Employee;

import static org.junit.Assert.assertEquals;

public class EmployeeTest {

    Employee employee;

    @Before
    public void before(){
        employee = new Employee("Bob", 1234567, 25000);
    }

    @Test
    public void hasName(){
        assertEquals("Bob", employee.getName());
    }

    @Test
    public void cannotHaveEmptyStringForName(){
        employee.setName("");
        assertEquals("Bob", employee.getName());
    }

    @Test
    public void hasNiNumber(){
        assertEquals(1234567, employee.getNiNumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(25000, employee.getSalary(), 0.00);
    }

    @Test
    public void canIncrementSalary(){
        employee.raiseSalary(5000);
        assertEquals(30000, employee.getSalary(), 0.00);
    }
    @Test
    public void cannotHaveNegativeIncrement(){
        employee.raiseSalary(-5000);
        assertEquals(25000, employee.getSalary(), 0.00);
    }

    @Test
    public void canCalculatePayBonus(){
        assertEquals(250,employee.getPayBonus(), 0.0);
    }

}
