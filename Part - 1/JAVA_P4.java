
import java.util.Scanner;

class JAVA_P4{

public static void main(String[] args) {

float []daily_budge = new float[30];
int i;
Scanner sc = new Scanner(System.in);
float t_expense_of_1_month=0;
for(i=0;i<30;i++){
System.out.print("Day "+(i+1)+" expenses is :");
daily_budge[i]=sc.nextFloat();
t_expense_of_1_month+=daily_budge[i];
}
System.out.println("Total expense of this month is : "+t_expense_of_1_month);

}
}
