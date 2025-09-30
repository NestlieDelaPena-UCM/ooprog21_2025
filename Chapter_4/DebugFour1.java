import java.util.Scanner;

public class DebugFour1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a radius for a circle >> ");
        int radius = input.nextInt();

        DebugCircle c = new DebugCircle(radius);  // uses DebugCircle

        System.out.println("The radius is " + c.getRad());
        System.out.println("The diameter is " + c.getDiam());
        System.out.printf("The area is %.2f%n", c.getArea());
    }
}
