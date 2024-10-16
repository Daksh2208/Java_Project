
public class JAVA_P5 {

    public static void main(String[] args) {
    int[] productCodes = {1, 2, 3, 4, 5};
    double[] prices = {350.0, 950.0, 750.0, 450.0, 280.0};
    
    
    double totalBill = 0;
    System.out.printf("Product Code     Price     Tax Rate     Total Price\n");
    for (int i = 0; i < productCodes.length; i++) {
    int productCode = productCodes[i];
    double price = prices[i];
    
    double taxRate;
    switch (productCode) {
    case 1:
    taxRate = 0.08; // 8% tax for motor
    break;
    case 2:
    taxRate = 0.12; // 12% tax for fan
    break;
    case 3:
    taxRate = 0.05; // 5% tax for tube light
    break;
    case 4:
    taxRate = 0.075; // 7.5% tax for wires
    break;
    default:
    taxRate = 0.03; // 3% tax for all other items
    break;
    }
    
    double taxAmount = price * taxRate;
    double totalPrice = price + taxAmount;
    
    totalBill += totalPrice;
    
    System.out.printf("  %d              %.2f       %.2f      %.2f\n",productCode,price,taxRate
    *100,totalPrice);
    }
    System.out.println("-----------------------------------------------");
    System.out.printf("                           Total Bill: %.2f\n", totalBill);
    }
    }
    