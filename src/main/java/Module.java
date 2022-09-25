import java.util.ArrayList;

public class Module {
    private String name, id;
    private ArrayList<Student> students;
    private Lecturer lecturer;
    private ArrayList<Course> courses;

    public Module(String name, String id, Lecturer lecturer, ArrayList students) {
        this.name = name;
        this.id = id;
        this.lecturer = lecturer;
        this.students = students;
        this.courses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<Course> courses) {
        this.courses = courses;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public Lecturer getLecturer() {
        return lecturer;
    }

    public void setLecturer(Lecturer lecturer) {
        this.lecturer = lecturer;
    }

    @Override
    public String toString() {
        return "Module{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", students=" + students +
                ", lecturer=" + lecturer +
                ", courses=" + courses +
                '}';
    }
}
