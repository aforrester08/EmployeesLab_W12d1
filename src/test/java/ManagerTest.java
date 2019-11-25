import org.junit.Before;
import org.junit.Test;
import managment.Manager;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    private Manager manager;

    @Before
    public void before(){
        manager = new Manager("Alex", "PB44444", 26000, "Engineering");
    }

    @Test
    public void canGetName(){
        assertEquals("Alex", manager.getName());
    }
    @Test
    public void canSetName(){
        manager.setName("Dave");
        assertEquals("Dave", manager.getName());
    }
    @Test
    public void canGetNI(){
        assertEquals("PB44444", manager.getNINumber());
    }
    @Test
    public void canGetSalary(){
        assertEquals(26000, manager.getSalary(), 0);
    }
    @Test
    public void canGetDeptName(){
        assertEquals("Engineering", manager.getDeptName());
    }
    @Test
    public void canIncreaseSalary(){
        manager.increaseSalary(2000);
        assertEquals(28000, manager.getSalary(), 0);
    }
    @Test
    public void getPayBonus(){
        assertEquals(260, manager.payBonus(), 0);
    }

}
