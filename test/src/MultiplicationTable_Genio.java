import java.util.Scanner;
public class MultiplicationTable_Genio {
    public static void main(String[] args) {
        Scanner console= new Scanner(System.in);
        int input;
        System.out.print("Input a number : ");
        input= console.nextInt();
        for (int i=1;i<11;i++){
            int ans=input*i;
            System.out.println(input+" x "+i+" = "+ans);
        }
    }
}
