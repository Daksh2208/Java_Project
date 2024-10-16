
import java.util.Scanner;

interface AdvancedArithmetic {
int divisor_sum(int n);
}

public class JAVA_P22 implements AdvancedArithmetic {

public int divisor_sum(int n) {
int sum = 0;
for (int i = 1; i <= n; i++) {
if (n % i == 0) {
sum += i;
}
}
return sum;
}

public static void main(String[] args) {
JAVA_P22 myCalculator = new JAVA_P22();
int number ;
System.out.print("Enter the number : ");
Scanner sc= new Scanner(System.in);
number=sc.nextInt();
int result = myCalculator.divisor_sum(number);
System.out.println("Sum of divisors of " + number + " is: " + result);
}
}
