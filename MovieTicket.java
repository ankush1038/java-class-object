import java.util.Scanner;

public class MovieTicket {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking user input for movie ticket details
        System.out.println("Enter Movie Name : ");
        String movieName = sc.nextLine();

        System.out.println("Enter Seat Number : ");
        String seatNumber = sc.nextLine();

        System.out.println("Enter Ticket Price : ");
        double price = sc.nextDouble();

        // Creating a MovieTicket object with user input
        MovieTicket ticket = new MovieTicket(movieName, seatNumber, price);

        // Displaying ticket details
        ticket.displayTicket();

        // Closing Scanner
        sc.close();
    }

    // Attributes (fields)
    private String movieName;
    private String seatNumber;
    private double price;

    // Constructor to initialize MovieTicket object
    public MovieTicket(String movieName, String seatNumber, double price) {
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.price = price;
    }

    // Method to display ticket details
    public void displayTicket() {
        System.out.println("==== Movie Ticket Details ====");
        System.out.println("Movie Name : " + movieName);
        System.out.println("Seat Number : " + seatNumber);
        System.out.println("Ticket Price : $" + price);
    }
}
