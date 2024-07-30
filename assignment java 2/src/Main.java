import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;

public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.println("1. Add Item");
                System.out.println("2. Update Item");
                System.out.println("3. Display Inventory");
                System.out.println("4. Exit");
                System.out.print("Choose an option: ");
                int choice = scanner.nextInt();
                scanner.nextLine(); // consume newline

                switch (choice) {
                    case 1:
                        System.out.print("Enter item name: ");
                        String name = scanner.nextLine();
                        System.out.print("Enter item quantity: ");
                        int quantity = scanner.nextInt();
                        System.out.print("Enter item price: ");
                        double price = scanner.nextDouble();
                        inventory.addItem(new Item(name, quantity, price));
                        break;
                    case 2:
                        System.out.print("Enter item name to update: ");
                        String itemName = scanner.nextLine();
                        System.out.print("Enter new quantity: ");
                        int newQuantity = scanner.nextInt();
                        System.out.print("Enter new price: ");
                        double newPrice = scanner.nextDouble();
                        inventory.updateItem(itemName, newQuantity, newPrice);
                        break;
                    case 3:
                        inventory.displayInventory();
                        break;
                    case 4:
                        System.out.println("Exiting...");
                        scanner.close();
                        return;
                    default:
                        System.out.println("Invalid choice. Try again.");
                }
            } catch (InputMismatchException e) {
                ExceptionHandling.handleInputMismatchException(e);
                scanner.nextLine(); // consume the invalid input
            } catch (NoSuchElementException e) {
                ExceptionHandling.handleNoSuchElementException(e);
            } catch (IllegalArgumentException e) {
                ExceptionHandling.handleIllegalArgumentException(e);
            } catch (Exception e) {
                ExceptionHandling.handleException(e);
            }
        }
    }
}