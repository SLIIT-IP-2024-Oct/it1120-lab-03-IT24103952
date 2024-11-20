import java.util.Scanner;

public class IT24103952Lab3Q3 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the rupee amount: ");
        int amount = scanner.nextInt();

        
        int[] denominations = {5000, 1000, 500, 200, 100, 50, 20, 10, 5, 2, 1};
            int count = amount / denomination;
            
            System.out.println(denomination + " Notes – " + count);
            // Reduce the amount by the total value of the notes/coins used
            amount = amount % denomination;
        }

        // Close the scanner
        scanner.close();
    }
}
