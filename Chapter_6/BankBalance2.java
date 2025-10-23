import java.util.Scanner;
public class BankBalance2
{
    public static void main(String[] args)
    {
        double accountBalance;
        int userChoice;
        int yearCount = 1;
        final double INTEREST_RATE = 0.03;
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter initial bank balance > ");
        accountBalance = keyboard.nextDouble();
        keyboard.nextLine();

        do {
            accountBalance = accountBalance + accountBalance * INTEREST_RATE;
            System.out.println("After year " + yearCount + " at " + INTEREST_RATE +
                " interest rate, balance is $" + accountBalance);
            yearCount = yearCount + 1;

            System.out.println("\nDo you want to see the balance " +
                "at the end of another year?");
            System.out.println("Enter 1 for yes");
            System.out.print("or any other number for no >> ");
            userChoice = keyboard.nextInt();

        } while (userChoice == 1);
    }
}