import java.util.Scanner;
 public class IT24103952Lab3Q1A{
  public static void main(String[]args){
 
 Scanner scanner=new Scanner(System.in); 
   System.out.println("Enter the price per kilogram:");
      int priceOfPerKilogram =scanner.nextInt();
   System.out.println("Enter the number of kilogram:");
      int numberOfKilogram=scanner.nextInt();
// calculate the total amount
  int totalAmount =priceOfPerKilogram * numberOfKilogram;
 System.out.println("Total amount: " + totalAmount);
scanner.close();
}
}

