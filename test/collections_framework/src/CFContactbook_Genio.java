import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

class Contact {
    private final String name;
    private final String phoneNumber;

    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}

public class CFContactbook_Genio {
    private final ArrayList<Contact> contacts;

    public CFContactbook_Genio() {
        contacts = new ArrayList<>();
    }

    public void addContact(Contact contact) {
        contacts.add(contact);
    }

    public void deleteContact(Contact contact) {
        contacts.remove(contact);
    }

    public Contact searchContact(String name) {
        for (Contact contact : contacts) {
            if (contact.getName().equalsIgnoreCase(name)) {
                return contact;
            }
        }
        return null;
    }

    public void displayContacts() {
        if (contacts.isEmpty()) {
            System.out.println("Contact book is empty.");
        } else {
            System.out.println("Contacts:");
            for (Contact contact : contacts) {
                System.out.println("Name: " + contact.getName() + ", Phone Number: " + contact.getPhoneNumber());
            }
        }
    }

    public void displayContactsAlphabetically() {
        if (contacts.isEmpty()) {
            System.out.println("Contact book is empty.");
        } else {
            ArrayList<Contact> sortedContacts = new ArrayList<>(contacts);
            sortedContacts.sort(Comparator.comparing(Contact::getName));

            System.out.println("Contacts (Alphabetical Order):");
            for (Contact contact : sortedContacts) {
                System.out.println("Name: " + contact.getName() + ", Phone Number: " + contact.getPhoneNumber());
            }
        }
    }

    public static void main(String[] args) {
        CFContactbook_Genio contactBook = new CFContactbook_Genio();
        Scanner scanner = new Scanner(System.in);
        String choice;

        do {
            System.out.println("\nContact Book Menu:");
            System.out.println("1. Add contact");
            System.out.println("2. Delete contact");
            System.out.println("3. Search contact");
            System.out.println("4. Display contacts");
            System.out.println("5. Display contacts in alphabetical order");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter phone number: ");
                    String phoneNumber = scanner.nextLine();
                    Contact contact = new Contact(name, phoneNumber);
                    contactBook.addContact(contact);
                    System.out.println("Contact added successfully.");
                    break;
                case "2":
                    System.out.print("Enter name of contact to delete: ");
                    String deleteName = scanner.nextLine();
                    Contact deleteContact = contactBook.searchContact(deleteName);
                    if (deleteContact != null) {
                        contactBook.deleteContact(deleteContact);
                        System.out.println("Contact deleted successfully.");
                    } else {
                        System.out.println("Contact not found.");
                    }
                    break;
                case "3":
                    System.out.print("Enter name of contact to search: ");
                    String searchName = scanner.nextLine();
                    Contact searchResult = contactBook.searchContact(searchName);
                    if (searchResult != null) {
                        System.out.println("Contact found:");
                        System.out.println("Name: " + searchResult.getName() + ", Phone Number: " + searchResult.getPhoneNumber());
                    } else {
                        System.out.println("Contact not found.");
                    }
                    break;
                case "4":
                    contactBook.displayContacts();
                    break;
                case "5":
                    contactBook.displayContactsAlphabetically();
                    break;
                case "6":
                    System.out.println("Exiting Contact Book...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (!choice.equals("6"));


    }
}
