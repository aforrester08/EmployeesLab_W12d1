import org.junit.Before;
import org.junit.Test;
import techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DevelperTest {

    private Developer dev;

    @Before
    public void before(){
        dev = new Developer("Zsolt", "YT66666", 30000);
    }
    @Test
    public void canGetName(){
        assertEquals("Zsolt", dev.getName());
    }
    @Test
    public void canGetNI(){
        assertEquals("YT66666", dev.getNINumber());
    }
    @Test
    public void canGetSalary(){
        assertEquals(30000, dev.getSalary(), 0);
    }
    @Test
    public void canIncreaseSalary(){
        dev.increaseSalary(2000);
        assertEquals(32000, dev.getSalary(), 0);
    }
    @Test
    public void getPayBonus(){
        assertEquals(300, dev.payBonus(), 0);
    }
}
