//programmer:Carlos Miguel B perez 
//lab 5
import java.util.Scanner;

public class RestaurantOrderSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int menuChoice;
        int quantity;
        double totalAmount = 0;
        boolean keepOrdering = true;

        while (keepOrdering) {
            System.out.println("MENU");
            System.out.println("1. Burger    - PHP 100");
            System.out.println("2. Fries     - PHP 50");
            System.out.println("3. Soda      - PHP 30");
            System.out.println("4. Ice Cream - PHP 45");
            System.out.println("5. Exit");
            System.out.print("Enter the menu number of your choice: ");
            
            menuChoice = scanner.nextInt();

            switch (menuChoice) {
                case 1:
                    System.out.print("Enter the quantity: ");
                    quantity = scanner.nextInt();
                    totalAmount = 100 * quantity;
                    System.out.println("You ordered Burger.");
                    System.out.println("Total amount: " + totalAmount + " PHP");
                    break;

                case 2:
                    System.out.print("Enter the quantity: ");
                    quantity = scanner.nextInt();
                    totalAmount = 50 * quantity;
                    System.out.println("You ordered Fries.");
                    System.out.println("Total amount: " + totalAmount + " PHP");
                    break;

                case 3:
                    System.out.print("Enter the quantity: ");
                    quantity = scanner.nextInt();
                    totalAmount = 30 * quantity;
                    System.out.println("You ordered Soda.");
                    System.out.println("Total amount: " + totalAmount + " PHP");
                    break;

                case 4:
                    System.out.print("Enter the quantity: ");
                    quantity = scanner.nextInt();
                    totalAmount = 45 * quantity;
                    System.out.println("You ordered Ice Cream.");
                    System.out.println("Total amount: " + totalAmount + " PHP");
                    break;

                case 5:
                    System.out.println("Thank you for your order. Goodbye!");
                    keepOrdering = false;
                    break;

                default:
                    System.out.println("Invalid choice, please try again.");
                    break;
            }
        }

        scanner.close();
    }
}

                
          
