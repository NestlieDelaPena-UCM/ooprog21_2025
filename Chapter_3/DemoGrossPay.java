import java.util.Scanner;

public class DemoGrossPay {
   public static void main(String[] args) {
   
   Scanner input = new Scanner(System.in);
   
   System.out.print("Enter the number of hours worked >> ");
   double hours = input.nextDouble(); 
   
   calculateGross(hours);
   }
   
   public static void calculateGross(double hours) {
      final double RATE = 22.75; //standard hourly rate which i will assume is dollars
      double grossPay = hours * RATE;
      System.out.println("Your gross pay in $ is: " + grossPay);
   }
}
