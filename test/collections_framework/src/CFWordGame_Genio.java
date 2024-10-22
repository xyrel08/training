import java.util.HashSet;
import java.util.Scanner;

public class CFWordGame_Genio {
    private HashSet<String> wordSet;

    public CFWordGame_Genio() {
        wordSet = new HashSet<>();
    }

    public void addWord(String word) {
        wordSet.add(word.toLowerCase());
    }

    public boolean containsWord(String word) {
        return wordSet.contains(word.toLowerCase());
    }

    public static void main(String[] args) {
        CFWordGame_Genio dictionary = new CFWordGame_Genio();
        Scanner scanner = new Scanner(System.in);
        char ans;
        dictionary.addWord("apple");
        dictionary.addWord("banana");
        dictionary.addWord("cat");
        dictionary.addWord("dog");
        dictionary.addWord("elephant");
        do {
            System.out.print("Enter a word to check in the dictionary: ");
            String word = scanner.nextLine();

            if (dictionary.containsWord(word)) {
                System.out.println("The word \"" + word + "\" exists in the dictionary.");
            } else {
                System.out.println("The word \"" + word + "\" does not exist in the dictionary.");
            }
            System.out.print("Do you want to try again ? ");
            ans = scanner.nextLine().charAt(0);
        } while (ans == 'y' || ans == 'Y');

    }
}
