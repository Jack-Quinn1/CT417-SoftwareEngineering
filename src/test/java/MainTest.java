import org.joda.time.DateTime;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

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

    @Test
    public void lecturerTest(){
        Lecturer l1 = new Lecturer("Des Chambers", "06/03/1965", 57, 54367891);

        assertEquals("Des Chambers", l1.getName());
        assertEquals("06/03/1965", l1.getDob());
        assertEquals(57, l1.getAge());
        assertEquals(54367891, l1.getId());
        assertEquals("Des Chambers57", l1.getUsername());
    }

    @Test
    public void ModuleTest(){
        Student s1 = new Student("Jack Quinn", "10/04/2001", 21, 19316166);
        Lecturer l1 = new Lecturer("Des Chambers", "06/03/1965", 57, 54367891);

        ArrayList<Student> students = new ArrayList<>();
        students.add(s1);

        Module module = new Module("Networks", "CT3531", l1, students);
        assertEquals("Networks", module.getName());
        assertEquals("CT3531", module.getId());
        assertNotNull("No students", module.getStudents());
        assertNotNull("No lecturer", module.getLecturer());
    }

    @Test
    public void CourseTest(){
        Student s1 = new Student("Jack Quinn", "10/04/2001", 21, 19316166);
        Lecturer l1 = new Lecturer("Des Chambers", "06/03/1965", 57, 54367891);
        ArrayList<Student> students = new ArrayList<>();
        students.add(s1);

        Module module = new Module("Networks", "CT3531", l1, students);
        ArrayList<Module> modules = new ArrayList<>();
        modules.add(module);

        DateTime start = new DateTime("2022-09-01");
        DateTime end = new DateTime("2026-06-01");

        Course course = new Course("Computer Science & IT", modules, students, start, end);
        assertEquals("Computer Science & IT", course.getName());
        assertNotNull("No Lecturer", course.getModules());
        assertNotNull("No students", course.getStudents());
        assertNotNull("No start time", course.getStartDate());
        assertNotNull("No end time", course.getEndDate());
    }
}
