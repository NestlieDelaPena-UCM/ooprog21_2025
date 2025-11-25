import java.util.Scanner;

public class CompareStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name > ");
        String input = sc.nextLine();

        String predefined = "Carmen";

        if (input.equals(predefined)) {
            System.out.println("Carmen equals Carmen");
        } else {
            System.out.println(input + " does not equal " + predefined.toLowerCase());
        }

        sc.close();
    }
}
