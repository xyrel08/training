import java.util.Scanner;
public class VowelOrConsonant_Genio {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter a letter to check whether if it is a vowel or a consonant : ");
        char letter = console.next().charAt(0);

            if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u' || letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U') {
                System.out.println("The letter you entered," + letter + ",is a vowel");
            } else if(letter == 'b'|| letter == 'B'|| letter == 'c'|| letter == 'C'|| letter == 'd'|| letter == 'D'|| letter == 'f'|| letter == 'F'|| letter == 'g'|| letter == 'G'|| letter == 'h'|| letter == 'H'|| letter == 'j'|| letter == 'J'|| letter == 'k'|| letter == 'K'|| letter == 'l'|| letter == 'L'|| letter == 'm'|| letter == 'M'|| letter == 'n'|| letter == 'N'|| letter == 'p'|| letter == 'P'|| letter == 'q'|| letter == 'Q'|| letter == 'r'|| letter == 'R'|| letter == 's'|| letter == 'S'|| letter == 't'|| letter == 'T'|| letter == 'v'|| letter == 'V'|| letter == 'w'|| letter == 'W'|| letter == 'x'|| letter == 'X'|| letter == 'y'|| letter == 'Y'|| letter == 'z'|| letter == 'Z') {
                System.out.println("The letter you entered," + letter + ", is a consonant");
            }else{
                System.out.println("Please enter a letter only!");
            }
        }

    }

