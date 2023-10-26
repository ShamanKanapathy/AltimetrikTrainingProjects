import java.util.*;

public class RestaurantMenu {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        System.out.println("Welcome to Star Restaurant");

        do {
            System.out.println("Get a menu card");
            System.out.println("1. Snacks");
            System.out.println("2. Lunch");
            System.out.println("3. Dinner");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    displaySnacksMenu();
                    break;

                case 2:
                    displayLunchMenu();
                    break;

                case 3:
                    displayDinnerMenu();
                    break;

                case 4:
                    System.out.println("Thank you for visiting Star Restaurant!");
                    break;

                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        } while (choice != 4);

        sc.close();
    }

    public static void displaySnacksMenu() {
        System.out.println("Snacks Menu:");
        System.out.println("Sr No\tSnackItem\tqty\tRate");
        System.out.println("1\tIdli\t1\t35");
        System.out.println("2\tPoha\t1\t20");
        System.out.println("3\tTea/Coffee\t1\t15");
    }

    public static void displayLunchMenu() {
        System.out.println("Lunch Menu:");
        System.out.println("Sr No\tLunch Item\tqty\tRate");
        System.out.println("1\tMeals\t1\t135");
        System.out.println("2\tChapati\t1\t80");
        System.out.println("3\tBiryani\t1\t150");
    }

    public static void displayDinnerMenu() {
        System.out.println("Dinner Menu:");
        System.out.println("Sr No\tDinner Item\tqty\tRate");
        System.out.println("1\tPaneer Tikka\t1\t135");
        System.out.println("2\tChapati\t1\t80");
        System.out.println("3\tParotta\t1\t120");
    }
}
