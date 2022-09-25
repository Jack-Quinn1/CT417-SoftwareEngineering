import java.util.ArrayList;

public class Student {
    private String name, DOB;
    private int age, id;
    private ArrayList<Course> courses;
    private ArrayList<Module> modulesReg;

    public String getName() {
        return name;
    }

    public Student(String name, String DOB, int age, int id) {
        this.name = name;
        this.DOB = DOB;
        this.courses = new ArrayList<>();
        this.modulesReg = new ArrayList<>();
        this.age = age;
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public String getUsername() {
        return getName()+getAge();
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<Course> courses) {
        this.courses = courses;
    }

    public ArrayList<Module> getModulesReg() {
        return modulesReg;
    }

    public void setModulesReg(ArrayList<Module> modulesReg) {
        this.modulesReg = modulesReg;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", DOB='" + DOB + '\'' +
                ", age=" + age +
                ", id=" + id +
                ", courses=" + courses +
                ", modulesReg=" + modulesReg +
                '}';
    }
}
