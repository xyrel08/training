import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Student {
    private String name;
    private int age;
    private String grade;

    public Student(String name, int age, String grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGrade() {
        return grade;
    }
}

public class CFStudentDatabase_Genio {
    private Map<String, Student> studentMap;

    public CFStudentDatabase_Genio() {
        studentMap = new HashMap<>();
    }

    public void addStudent(String id, Student student) {
        studentMap.put(id, student);
    }

    public Student getStudent(String id) {
        return studentMap.get(id);
    }

    public void displayAllStudents() {
        if (studentMap.isEmpty()) {
            System.out.println("No students in the system.");
        } else {
            System.out.println("Student Details:");
            for (Map.Entry<String, Student> entry : studentMap.entrySet()) {
                String id = entry.getKey();
                Student student = entry.getValue();
                System.out.println("Student ID: " + id);
                System.out.println("Name: " + student.getName());
                System.out.println("Age: " + student.getAge());
                System.out.println("Grade: " + student.getGrade());
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        CFStudentDatabase_Genio studentManagement = new CFStudentDatabase_Genio();
        Scanner scanner = new Scanner(System.in);
        String choice;

        do {
            System.out.println("\nStudent Management Menu:");
            System.out.println("1. Add student");
            System.out.println("2. Retrieve student information");
            System.out.println("3. Display all students' details");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    System.out.print("Enter student ID: ");
                    String id = scanner.nextLine();
                    System.out.print("Enter student name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter student age: ");
                    int age = Integer.parseInt(scanner.nextLine());
                    System.out.print("Enter student grade: ");
                    String grade = scanner.nextLine();

                    Student student = new Student(name, age, grade);
                    studentManagement.addStudent(id, student);
                    System.out.println("Student added successfully.");
                    break;
                case "2":
                    System.out.print("Enter student ID: ");
                    String retrieveId = scanner.nextLine();
                    Student retrievedStudent = studentManagement.getStudent(retrieveId);
                    if (retrievedStudent != null) {
                        System.out.println("Student ID: " + retrieveId);
                        System.out.println("Name: " + retrievedStudent.getName());
                        System.out.println("Age: " + retrievedStudent.getAge());
                        System.out.println("Grade: " + retrievedStudent.getGrade());
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;
                case "3":
                    studentManagement.displayAllStudents();
                    break;
                case "4":
                    System.out.println("Exiting Student Management...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (!choice.equals("4"));

        scanner.close();
    }
}