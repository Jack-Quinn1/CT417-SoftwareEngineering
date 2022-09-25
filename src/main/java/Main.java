import org.joda.time.DateTime;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Jack Quinn", "10/04/2001", 21, 19316166);
        Student s2 = new Student("Eddie O Reilly", "25/05/2001", 21, 19338459);
        Student s3 = new Student("Jordan Flanagan", "11/04/2001", 21, 19362455);

        Lecturer l1 = new Lecturer("Des Chambers", "06/03/1965", 57, 54367891);
        Lecturer l3 = new Lecturer("Frank Glavin", "03/10/1987", 35, 83929105);

        String a1 = s1.getUsername();
        s2.getUsername();
        s3.getUsername();

        l1.getUsername();
        l3.getUsername();

        ArrayList<Student> students = new ArrayList<>();
        students.add(s1);
        students.add(s2);
        students.add(s3);

        ArrayList<Student> students1 = new ArrayList<>();
        students1.add(s2);
        students1.add(s3);

        Module m1 = new Module("Networks", "CT3531", l1, students);
        Module m2 = new Module("Machine Learning", "CT4101", l3, students1);

        ArrayList<Module> modules = new ArrayList<>();
        modules.add(m1);
        modules.add(m2);

        DateTime start = new DateTime("2022-09-01");
        DateTime end = new DateTime("2026-06-01");

        Course course = new Course("Computer Science & IT", modules, students, start, end);

        System.out.println(course);
    }
}
