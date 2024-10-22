import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

abstract class Book {
    private String title;
    private String author;
    private double price;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public abstract void displayInfo();
}

class Novel extends Book {
    private String genre;

    public Novel(String title, String author, double price, String genre) {
        super(title, author, price);
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    @Override
    public void displayInfo() {
        System.out.println("Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("Price: $" + getPrice());
        System.out.println("Genre: " + getGenre());
    }
}

class Textbook extends Book {
    private String subject;

    public Textbook(String title, String author, double price, String subject) {
        super(title, author, price);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    @Override
    public void displayInfo() {
        System.out.println("Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("Price: $" + getPrice());
        System.out.println("Subject: " + getSubject());
    }
}

abstract class Customer {
    private String name;
    private String address;
    private List<Book> purchasedBooks;

    public Customer(String name, String address) {
        this.name = name;
        this.address = address;
        this.purchasedBooks = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void addPurchasedBook(Book book) {
        purchasedBooks.add(book);
        System.out.println("Book purchased: " + book.getTitle());
    }

    public void displayPurchasedBooks() {
        if (purchasedBooks.isEmpty()) {
            System.out.println("No books purchased.");
        } else {
            System.out.println("Purchased Books:");
            for (Book book : purchasedBooks) {
                book.displayInfo();
                System.out.println();
            }
        }
    }
}

class GuestCustomer extends Customer {
    public GuestCustomer(String name, String address) {
        super(name, address);
    }

    @Override
    public void addPurchasedBook(Book book) {
        System.out.println("Please sign up to make a purchase.");
    }

    @Override
    public void displayPurchasedBooks() {
        System.out.println("Please sign up to view purchased books.");
    }
}

class RegisteredCustomer extends Customer {
    public RegisteredCustomer(String name, String address) {
        super(name, address);
    }
}

class ShoppingCart {
    private List<Book> items;

    public ShoppingCart() {
        items = new ArrayList<>();
    }

    public void addItem(Book item) {
        items.add(item);
        System.out.println("Book added to cart: " + item.getTitle());
    }

    public void removeItem(Book item) {
        items.remove(item);
        System.out.println("Book removed from cart: " + item.getTitle());
    }

    public void displayCart() {
        if (items.isEmpty()) {
            System.out.println("Your cart is empty.");
            return;
        }

        System.out.println("Cart Items:");
        for (Book item : items) {
            item.displayInfo();
            System.out.println();
        }
    }

    public void checkout(Customer customer) {
        if (customer instanceof RegisteredCustomer) {
            RegisteredCustomer registeredCustomer = (RegisteredCustomer) customer;
            for (Book item : items) {
                registeredCustomer.addPurchasedBook(item);
            }
            items.clear();
            System.out.println("Checkout successful!");
        } else {
            System.out.println("Please sign up to checkout.");
        }
    }

    private double calculateTotal() {
        double total = 0;
        for (Book item : items) {
            total += item.getPrice();
        }
        return total;
    }
}

class OnlineBookstore {
    private List<Book> books;
    private ShoppingCart cart;

    public OnlineBookstore() {
        books = new ArrayList<>();
        cart = new ShoppingCart();
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added: " + book.getTitle());
    }

    public void searchBooks(String keyword) {
        System.out.println("--- Search Results ---");
        boolean found = false;
        for (Book book : books) {
            if (book.getTitle().toLowerCase().contains(keyword.toLowerCase()) ||
                    book.getAuthor().toLowerCase().contains(keyword.toLowerCase())) {
                book.displayInfo();
                System.out.println();
                found = true;
            }
        }
        if (!found) {
            System.out.println("No books found matching the keyword: " + keyword);
        }
    }

    public void displayAllBooks() {
        System.out.println("--- All Books ---");
        if (books.isEmpty()) {
            System.out.println("No books available.");
        } else {
            for (Book book : books) {
                book.displayInfo();
                System.out.println();
            }
        }
    }

    public void runBookstore() {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("--- Online Bookstore ---");
            System.out.println("1. Search Books");
            System.out.println("2. View All Books");
            System.out.println("3. View Cart");
            System.out.println("4. Add to Cart");
            System.out.println("5. Remove from Cart");
            System.out.println("6. Checkout");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter keyword to search for books: ");
                    String keyword = scanner.nextLine();
                    searchBooks(keyword);
                    break;
                case 2:
                    displayAllBooks();
                    break;
                case 3:
                    cart.displayCart();
                    break;
                case 4:
                    System.out.print("Enter the title of the book to add to cart: ");
                    String bookTitle = scanner.nextLine();
                    Book bookToAdd = findBookByTitle(bookTitle);
                    if (bookToAdd != null) {
                        cart.addItem(bookToAdd);
                    } else {
                        System.out.println("Book not found.");
                    }
                    break;
                case 5:
                    System.out.print("Enter the title of the book to remove from cart: ");
                    bookTitle = scanner.nextLine();
                    Book bookToRemove = findBookByTitle(bookTitle);
                    if (bookToRemove != null) {
                        cart.removeItem(bookToRemove);
                    } else {
                        System.out.println("Book not found in the cart.");
                    }
                    break;
                case 6:
                    System.out.print("Enter your name: ");
                    String customerName = scanner.nextLine();
                    System.out.print("Enter your address: ");
                    String customerAddress = scanner.nextLine();
                    RegisteredCustomer registeredCustomer = new RegisteredCustomer(customerName, customerAddress);
                    cart.checkout(registeredCustomer);
                    break;
                case 7:
                    exit = true;
                    System.out.println("Thank you for using the Online Bookstore. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }

            System.out.println();
        }
    }

    private Book findBookByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }
}

public class OOPAbstractionF_Genio {
    public static void main(String[] args) {
        OnlineBookstore bookstore = new OnlineBookstore();

        // Add sample books to the bookstore
        Book book1 = new Novel("The Great Gatsby", "F. Scott Fitzgerald", 10.99, "Classic");
        Book book2 = new Novel("To Kill a Mockingbird", "Harper Lee", 9.99, "Fiction");
        Book book3 = new Textbook("Introduction to Java Programming", "Y. Daniel Liang", 49.99, "Computer Science");

        bookstore.addBook(book1);
        bookstore.addBook(book2);
        bookstore.addBook(book3);

        // Run the bookstore
        bookstore.runBookstore();
    }
}