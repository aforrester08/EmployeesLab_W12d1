import org.junit.Before;
import org.junit.Test;
import techStaff.DataBaseAdmin;

import static org.junit.Assert.assertEquals;

public class DataBaseAdminTest {

    private DataBaseAdmin DBAdmin;

    @Before
    public void before(){
        DBAdmin = new DataBaseAdmin("Keith", "AG88888", 35000);
    }
    @Test
    public void canGetName(){
        assertEquals("Keith", DBAdmin.getName());
    }
    @Test
    public void canGetNI(){
        assertEquals("AG88888", DBAdmin.getNINumber());
    }
    @Test
    public void canGetSalary(){
        assertEquals(35000, DBAdmin.getSalary(), 0);
    }
    @Test
    public void canIncreaseSalary(){
        DBAdmin.increaseSalary(2000);
        assertEquals(37000, DBAdmin.getSalary(), 0);
    }
    @Test
    public void getPayBonus(){
        assertEquals(350, DBAdmin.payBonus(), 0);
    }
}
