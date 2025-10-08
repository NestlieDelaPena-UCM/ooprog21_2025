// DebugFive1 
// Adds your lunch bill
// Burger and hot dog are $2.59
// Grilled cheese and fish are $1.99
// Fries are 89 cents

import java.util.Scanner;

public class DebugFive1
{
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        final double HIGH_PRICE = 2.59;
        final double MED_PRICE = 1.99;
        final double LOW_PRICE = 0.89;
        int usersChoice;
        double bill = 0.0;
        String mainItem = "";
        String fries = "No fries";

        System.out.println("Order please:");
        System.out.println("1 - Burger");
        System.out.println("2 - Hotdog");
        System.out.println("3 - Grilled cheese");
        System.out.print("4 - Fish sandwich >> ");
        usersChoice = kb.nextInt();

        if (usersChoice == 1 || usersChoice == 2)
        {
            bill = bill + HIGH_PRICE;
            mainItem = (usersChoice == 1) ? "Burger" : "Hotdog";
        }
        else if (usersChoice == 3 || usersChoice == 4)
        {
            bill = bill + MED_PRICE;
            mainItem = (usersChoice == 3) ? "Grilled Cheese" : "Fish Sandwich";
        }
        else
        {
            System.out.println("Invalid choice. Please restart the program.");
            return;
        }

        System.out.print("Fries with that? 1 - Yes 2 - No >> ");
        usersChoice = kb.nextInt();

        if (usersChoice == 1)
        {
            bill = bill + LOW_PRICE;
            fries = "With Fries";
        }

        System.out.println("\nOrder Summary:");
        System.out.println("Main Item: " + mainItem);
        System.out.println("Side: " + fries);
        System.out.printf("Total bill is $%.2f%n", bill);
    }
}
