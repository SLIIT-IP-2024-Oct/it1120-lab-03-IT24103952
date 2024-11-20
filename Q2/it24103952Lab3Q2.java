import java.util.Scanner;

public class IT24103952Lab3Q2 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the monthly salary: ");
        double monthlySalary = scanner.nextDouble();

        
        System.out.print("Enter the number of OT hours: ");
        double otHours = scanner.nextDouble();

        
        System.out.print("Enter the OT hourly rate: ");
        double otHourlyRate = scanner.nextDouble();

        // Calculate the OT amount
        double otAmount = otHours * otHourlyRate;

        // Calculate the total salary
        double totalSalary = monthlySalary + otAmount;

        
System.out.println("The total salary is: " + totalSalary);

        
        scanner.close();
    }
}
