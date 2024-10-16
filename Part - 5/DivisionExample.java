import java.util.Scanner;

public class DivisionExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the first integer (x): ");
            int x = Integer.parseInt(scanner.nextLine()); 

            System.out.print("Enter the second integer (y): ");
            int y = Integer.parseInt(scanner.nextLine()); 

           
            int result = x / y;
            System.out.println("Result of " + x + " / " + y + " = " + result);
        } 
       
        catch (NumberFormatException e) {
            System.out.println("Error: Please enter valid integers.");
        } 
  
        catch (ArithmeticException e) {
            System.out.println("Division by zero is not allowed.");
        } 
   
        catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }
        // finally{
        //     System.out.println("The End Of Code");
        // }

        scanner.close();
    }
}
