import java.util.Scanner;

public class IT24103952Lab3Q4 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter a five-digit number: ");
        int number = scanner.nextInt();

        
        if (number < 10000 || number > 99999) {
            System.out.println("Please enter a valid five-digit number.");
        } else {
            // Extract and print each digit separated by a space
            int tens = number / 10000; 
            int thousands = (number % 10000) / 1000; 
            int hundreds = (number % 1000) / 100; 
            int tensPlace = (number % 100) / 10; 
            int ones = number % 10; 

            // Print each digit separated by a space
            System.out.println(tens + " " + thousands + " " + hundreds + " " + tensPlace + " " + ones);
        }

        
        scanner.close();
    }
}
