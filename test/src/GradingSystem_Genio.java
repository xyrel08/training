import java.util.Scanner;
public class GradingSystem_Genio {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int grade;
        char choice;
        do {
            System.out.print("Enter your grade : ");
            grade = console.nextInt();
            if(grade <= 100) {
                if (grade >= 90) {
                    System.out.println("A");
                } else if (grade >= 80) {
                    System.out.println("B");
                } else if (grade >= 70) {
                    System.out.println("C");
                } else if (grade >= 60) {
                    System.out.println("D");
                } else if (grade <= 59) {
                    System.out.println("F");
                } else {
                    System.out.println("The grade you entered is not accepted. Please Try again!");
                }
            }else{
                System.out.println("The grade you entered is not accepted. Please Try again!");
            }
            System.out.print("Do you want to continue Yes/No? :");
            choice = console.next().charAt(0);
        }while(choice=='y' || choice == 'Y');
    }
}
