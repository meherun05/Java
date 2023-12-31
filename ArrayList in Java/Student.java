public class Student {
    private String name;
    private String department;
    private int id;

    Student(String name, String department, int id) {
        this.name = name;
        this.department = department;
        this.id = id;
    }

    // get and set method

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // override
    public String toString() {
        return this.name + " " + this.department + " " + this.id;
    }
}