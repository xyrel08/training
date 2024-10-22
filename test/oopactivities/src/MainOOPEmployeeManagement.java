public class MainOOPEmployeeManagement {
    public static void main(String[] args) {
        OOPEmployeeManagement_Genio employee = new OOPEmployeeManagement_Genio("John Doe", 66805.60, 1234);
        System.out.println("Employee Details:");
        System.out.println("Name: " + employee.getName());
        System.out.println("Salary: " + employee.getSalary());
        System.out.println("ID: " + employee.getId());

        Manager manager = new Manager("Janine Cruz", 80560.88, 4321, "Sales");
        System.out.println("Manager Details:");
        System.out.println("Name: " + manager.getName());
        System.out.println("Salary: " + manager.getSalary());
        System.out.println("ID: " + manager.getId());
        System.out.println("Department: " + manager.getDepartment());

        Developer developer = new Developer("Mark Juan Rizal", 70520.70, 98765, "Java");
        System.out.println("Developer Details:");
        System.out.println("Name: " + developer.getName());
        System.out.println("Salary: "+developer.getSalary());
        System.out.println("Id: "+developer.getId());
        System.out.println("Department: " + developer.getProgrammingLanguage());
    }
}
