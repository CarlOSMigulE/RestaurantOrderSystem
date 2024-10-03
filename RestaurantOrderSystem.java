//programmer:Carlos Miguel B perez 
//RestaurantOrderSystem
import java.util.Scanner;

public class RestaurantOrderSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalAmount = 0;
        boolean continueOrdering = true;

        // Display the menu
        while (continueOrdering) {
            System.out.println("MENU");
            System.out.println("1. Chesse burger-PHP 100");
            System.out.println("2. French fries    - PHP  50");
            System.out.println("3. Cola     - PHP  30");
            System.out.println("4. cornetto - PHP  20");
            System.out.println("5. Exit");

            // Ask user to select a menu item
            System.out.print("Enter the menu number of your choice: ");
            int choice = scanner.nextInt();

            // Exit the loop if the user chooses "Exit"
            if (choice == 5) {
                continueOrdering = false;
                System.out.println("Thank you for your order!");
                break;
            }

            // Validate the choice and handle the order
            if (choice < 1 || choice > 4) {
                System.out.println("Invalid choice, please select a valid menu item.");
                continue; // Skip the rest of the loop and go back to the menu
            }

            // Ask for the quantity
            System.out.print("Enter the quantity: ");
            int quantity = scanner.nextInt();

            // Validate the quantity
            if (quantity <= 0) {
                System.out.println("Please enter a valid quantity (greater than 0).");
                continue; // Skip to the next iteration to allow reordering
            }

            // Calculate the total cost based on the choice
            int itemPrice = 0;
            String itemName = "";

            switch (choice) {
                case 1:
                    itemPrice = 100;
                    itemName = "cheese burger";
                    break;
                case 2:
                    itemPrice = 50;
                    itemName = "French fries";
                    break;
                case 3:
                    itemPrice = 30;
                    itemName = "cola";
                    break;
                case 4:
                    itemPrice = 45;
                    itemName = "milk shake";
                    break;
            }

            // Calculate the total amount for this item
            int itemTotal = itemPrice * quantity;
            totalAmount += itemTotal;

            // Display the order details
            System.out.printf("You ordered %s.%n", itemName);
            System.out.printf("Total amount for this item: PHP %d%n", itemTotal);

            // Ask if they want to order more items or exit
            System.out.print("Would you like to order more items? (yes/no): ");
            String response = scanner.next();
            if (response.equalsIgnoreCase("no")) {
                continueOrdering = false;
                System.out.println("Thank you for your order!");
            }
        }

        // Final total bill
        System.out.printf("Your total bill is: PHP %d%n", totalAmount);

        // Close the scanner
        scanner.close();
    }
}
