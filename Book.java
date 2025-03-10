import java.util.Scanner;

public class Book {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking user input for book details
        System.out.println("Enter Book Title : ");
        String title = sc.nextLine();

        System.out.println("Enter Author Name : ");
        String author = sc.nextLine();

        System.out.println("Enter Book Price : ");
        double price = sc.nextDouble();

        // Creating a Book object with user input
        Book book = new Book(title, author, price);

        // Displaying book details
        book.displayDetails();

        // Closing Scanner
        sc.close();
    }

    // Attributes (fields)
    private String title;
    private String author;
    private double price;

    // Constructor to initialize Book object
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Method to display book details
    public void displayDetails() {
        System.out.println("==== Book Details ====");
        System.out.println("Title : " + title);
        System.out.println("Author : " + author);
        System.out.println("Price : $" + price);
    }
}
