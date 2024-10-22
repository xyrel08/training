import java.util.Scanner;

public class ReversedString_Genio {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String original, reverse = "";
        System.out.print("Enter a string to reverse:");
        original= console.nextLine();
        int length = original.length();
        for (int i = length - 1 ; i >= 0 ; i--) {
            reverse = reverse + original.charAt(i);

            System.out.println("Reverse of the string: " + reverse);
        }
        }
}
