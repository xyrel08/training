import java.util.Arrays;

public class Test {
    int numers=1;
    public static void main(String[] args) {

        int [][] numbers=
                {
                {0,2,4,6},
                {1,3,7,8},
                {4,8,7,6},
                {9,4,3,2}
        };
        System.out.println(Arrays.toString(numbers[0]));
        System.out.println(Arrays.toString(numbers[1]));
        System.out.println(Arrays.toString(numbers[2]));
        System.out.println(Arrays.toString(numbers[3]));
        System.out.println(Arrays.toString(numbers));
        System.out.println(numbers.length);
        System.out.println(numbers[0][0]);




    }
}
