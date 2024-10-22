public class OOPEmployeeManagement_Genio {
    private String name;
    private double salary;
    private int id;

    public OOPEmployeeManagement_Genio(String name, double salary, int id) {
        this.name = name;
        this.salary = salary;
        this.id = id;
    }


    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setId(int id) {
        this.id = id;
    }
}
class Manager extends OOPEmployeeManagement_Genio {
    private String department;

    public Manager(String name, double salary, int id, String department) {
        super(name, salary, id);
        this.department = department;
    }


    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}

class Developer extends OOPEmployeeManagement_Genio {
    private String programmingLanguage;

    public Developer(String name, double salary, int id, String programmingLanguage) {
        super(name, salary, id);
        this.programmingLanguage = programmingLanguage;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }
}