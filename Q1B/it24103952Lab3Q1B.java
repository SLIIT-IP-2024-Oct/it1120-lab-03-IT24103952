import java.util.Scanner;

public class IT24103952Lab3Q1B {
    public static void main(String[] args) {
        
        
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the total bill amount: ");
        double totalBill = scanner.nextDouble(); 

        
        double discountPercentage = 10.0;

        // Calculate the discount amount
        double discountAmount = totalBill * (discountPercentage/100);

        // Calculate the amount to pay after the discount
        double amountToPay = totalBill - discountAmount;

        // Output the results
        System.out.println("Total bill amount: " + totalBill);
        System.out.println("Discount (10%): " + discountAmount);
        System.out.println("Amount to pay after discount: " + amountToPay);

        // Close the scanner
        scanner.close();
    }
}
