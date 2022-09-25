import java.util.ArrayList;

public class Lecturer {
    private String name,dob;
    private int id, age;
    private ArrayList<Module> modulesTeach;

    public Lecturer(String name,  String dob, int age, int id) {
        this.name = name;
        this.age = age;
        this.dob = dob;
        this.modulesTeach = new ArrayList<>();
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getUsername() {
        return getName()+getAge();
    }

    public ArrayList<Module> getModulesTeach() {
        return modulesTeach;
    }

    public void setModulesTeach(ArrayList<Module> modulesTeach) {
        this.modulesTeach = modulesTeach;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
