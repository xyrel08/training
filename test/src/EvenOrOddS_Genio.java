import java.util.Scanner;

public class EvenOrOddS_Genio {
    public static void main(String[] args) {
        Scanner console= new Scanner(System.in);
        System.out.print("Enter a word : ");
        String word = console.next();
        int result = word.length()%2;
        if (result == 0){
            System.out.println("The length of the word you entered is Even");
        }else{
            System.out.println("The length of the word you entered is Odd");
        }
    }
}
