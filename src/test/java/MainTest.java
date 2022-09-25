import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest{

    @Test
    public void studentTest(){
        Student s1 = new Student("Jack Quinn", "10/04/2001", 21, 19316166);

        assertEquals("Jack Quinn", s1.getName());
        assertEquals("10/04/2001", s1.getDOB());
        assertEquals(21, s1.getAge());
        assertEquals(19316166, s1.getId());
        assertEquals("Jack Quinn21", s1.getUsername());
    }
}
