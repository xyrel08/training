import java.util.Scanner;
public class Calculator_Genio {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int num1;
        int num2;
        System.out.println("This is a simple calculator where you, the user will input 2 numbers and an operator");
        System.out.print("Enter First Number : ");
        num1= console.nextInt();
        System.out.print("Enter Second Number : ");
        num2=console.nextInt();
        System.out.print("Enter your preferred Operator : ");
        char symbol = console.next().charAt(0);
        int result;

        switch (symbol) {
            case '+':
                result=num1+num2;
                System.out.println(num1 + " " + symbol + " " + num2 + " = " + result);
                break;
            case '-':
                result=num1-num2;
                System.out.println(num1 + " " + symbol + " " + num2 + " = " + result);
                break;
            case '*':
                result=num1*num2;
                System.out.println(num1 + " " + symbol + " " + num2 + " = " + result);
                break;
            case '/':
                if(num1 ==0 || num2 == 0){
                    System.out.println("Error");
                }else{
                    result=num1/num2;
                    System.out.println(num1 + " " + symbol + " " + num2 + " = " + result);
                    break;
                }
        }
    }
}
