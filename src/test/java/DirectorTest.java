import managment.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    private Director director;

    @Before
    public void before(){
        director = new Director("Mellinda", "HB77777", 70000, "Finance", 100000);
    }

    @Test
    public void canGetName(){
        assertEquals("Mellinda", director.getName());
    }
    @Test
    public void canGetNI(){
        assertEquals("HB77777", director.getNINumber());
    }
    @Test
    public void canGetSalary(){
        assertEquals(70000, director.getSalary(), 0);
    }
    @Test
    public void canGetDeptName(){
        assertEquals("Finance", director.getDeptName());
    }
    @Test
    public void canIncreaseSalary(){
        director.increaseSalary(2000);
        assertEquals(72000, director.getSalary(), 0);
    }
    @Test
    public void getPayBonus(){
        assertEquals(700, director.payBonus(), 0);
    }
    @Test
    public void canGetBudget(){
        assertEquals(100000, director.getBudget(), 0);
    }
}
