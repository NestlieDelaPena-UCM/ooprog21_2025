public class Employee {
    private double payRate;
    private double hoursWorked;
    private static final double OVERTIME_MULTIPLIER = 1.5;

    public Employee(double hoursWorked, double payRate) {
        this.hoursWorked = hoursWorked;
        this.payRate = payRate;
    }

    public double getRegularPay() {
        double regularHours = Math.min(hoursWorked, 40);
        return regularHours * payRate;
    }

    public double getOvertimePay() {
        double overtimeHours = Math.max(0, hoursWorked - 40);
        return overtimeHours * payRate * OVERTIME_MULTIPLIER;
    }
}
