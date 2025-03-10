import java.util.Scanner;

public class ShoppingCart {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking user input for cart item details
        System.out.println("Enter Item Name : ");
        String itemName = sc.nextLine();

        System.out.println("Enter Price : ");
        double price = sc.nextDouble();

        System.out.println("Enter Quantity : ");
        int quantity = sc.nextInt();

        // Creating a CartItem object with user input
        CartItem item = new CartItem(itemName, price, quantity);

        // Displaying item details
        item.displayItem();

        // Calculating and displaying total cost
        System.out.println("Total Cost : $" + item.calculateTotal());

        // Closing Scanner
        sc.close();
    }
}

// Class Definition
class CartItem {
    // Attributes (fields)
    private String itemName;
    private double price;
    private int quantity;

    // Constructor to initialize CartItem object
    public CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // Method to calculate total price for the item
    public double calculateTotal() {
        return price * quantity;
    }

    // Method to display item details
    public void displayItem() {
        System.out.println("==== Cart Item Details ====");
        System.out.println("Item Name : " + itemName);
        System.out.println("Price : $" + price);
        System.out.println("Quantity : " + quantity);
    }
}
