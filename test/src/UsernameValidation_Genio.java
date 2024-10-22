import java.util.Scanner;

public class UsernameValidation_Genio {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isValid = false;

        while (!isValid) {
            System.out.print("Enter username: ");
            String username = scanner.nextLine();

            if (username.length() < 6 || username.length() > 20) {
                System.out.println("ERROR: USERNAME MUST HAVE A MINIMUM LENGTH OF 6 CHARACTERS AND A MAXIMUM LENGTH OF 20 CHARACTERS.");
                continue;
            }
            if (!username.matches("^[a-zA-Z0-9]*$")) {
                System.out.println("ERROR: USERNAME CAN ONLY CONTAIN ALPHANUMERIC(LETTERS AND NUMBERS) CHARACTERS.");
                continue;
            }
            boolean hasUppercase = false;
            boolean hasLowercase = false;

            for (int i = 0; i < username.length(); i++) {
                if (Character.isUpperCase(username.charAt(i))) {
                    hasUppercase = true;
                } else if (Character.isLowerCase(username.charAt(i))) {
                    hasLowercase = true;
                }

                if (hasUppercase && hasLowercase) {
                    break;
                }
            }
            if (!hasUppercase || !hasLowercase) {
                System.out.println("ERROR: USERNAME MUST HAVE BOTH UPPERCASE AND LOWERCASE LETTERS.");
                continue;
            }
            char firstChar = username.charAt(0);
            if (!Character.isLetter(firstChar)) {
                System.out.println("ERROR: USERNAME MUST START WITH A LETTER.");
                continue;
            }
            isValid = true;

            System.out.println("SUCCESS! THE USERNAME IS VALID.");
        }
    }
}