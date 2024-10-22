import java.util.Scanner;
public class NumberGuessing_Genio {
    public static void main(String[] args) {
        Scanner console= new Scanner(System.in);
        int max = 100;
        int min = 1;
        int range = max - min + 1;
        int rand = (int)(Math.random() * range) + min;
        int ans;

        do{
            System.out.println("Guess a number from 1 to 100: ");
            ans= console.nextInt();
            if( ans == rand){
                System.out.println("You guessed the correct answer!☻");
            } else if (ans>rand) {
                System.out.println("Lower");
            }else if (ans<rand){
                System.out.println("Higher");
            }
        }while(ans!=rand);
    }
}
