import java.util.Scanner;

public class JAVA_P12 {

    private static final double CONVERSION_RATE = 100.0;

    public static void main(String[] args) {
        if (args.length > 0) {
            double pounds = Double.parseDouble(args[0]);
            double rupees = convertToRupees(pounds);
            System.out.printf("%.2f Pounds = %.2f Rupees\n", pounds, rupees);
        } else {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter amount in Pounds: ");
            double pounds = scanner.nextDouble();
            double rupees = convertToRupees(pounds);
            System.out.printf("%.2f Pounds = %.2f Rupees\n", pounds, rupees);
        }
    }

    private static double convertToRupees(double pounds) {
        return pounds * CONVERSION_RATE;
    }
}
