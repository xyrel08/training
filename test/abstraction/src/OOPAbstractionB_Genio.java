import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Recipe {
    private String name;
    private String instructions;

    public Recipe(String name, String instructions) {
        this.name = name;
        this.instructions = instructions;
    }

    public String getName() {
        return name;
    }

    public String getInstructions() {
        return instructions;
    }
}

class RecipeOrganizer {
    private List<Recipe> recipes;
    private Scanner scanner;

    public RecipeOrganizer() {
        recipes = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void addRecipe() {
        System.out.print("Enter the recipe name:");
        String name = scanner.nextLine();

        System.out.print("Enter the recipe instructions:");
        String instructions = scanner.nextLine();

        Recipe recipe = new Recipe(name, instructions);
        recipes.add(recipe);

        System.out.println("Recipe added successfully!");
    }

    public void deleteRecipe() {
        System.out.println("Enter the recipe name to delete:");
        String name = scanner.nextLine();

        Recipe recipe = findRecipeByName(name);

        if (recipe != null) {
            recipes.remove(recipe);
            System.out.println("Recipe deleted successfully!");
        } else {
            System.out.println("Recipe not found.");
        }
    }

    public void searchRecipe() {
        System.out.println("Enter the recipe name to search:");
        String name = scanner.nextLine();

        Recipe recipe = findRecipeByName(name);

        if (recipe != null) {
            System.out.println("Recipe found:");
            System.out.println("Name: " + recipe.getName());
            System.out.println("Instructions: " + recipe.getInstructions());
        } else {
            System.out.println("Recipe not found.");
        }
    }

    private Recipe findRecipeByName(String name) {
        for (Recipe recipe : recipes) {
            if (recipe.getName().equalsIgnoreCase(name)) {
                return recipe;
            }
        }
        return null;
    }
}

public class OOPAbstractionB_Genio {
    public static void main(String[] args) {
        RecipeOrganizer organizer = new RecipeOrganizer();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Recipe Organizer ---");
            System.out.println("1. Add Recipe");
            System.out.println("2. Delete Recipe");
            System.out.println("3. Search Recipe");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    organizer.addRecipe();
                    break;
                case "2":
                    organizer.deleteRecipe();
                    break;
                case "3":
                    organizer.searchRecipe();
                    break;
                case "4":
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }
}