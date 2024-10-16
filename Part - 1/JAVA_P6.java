import java.util.Scanner;

public class JAVA_P6 {
public static void main(String[] args) {
int i,n;
double a=0,b=1;
double c;
double sum=1;
System.out.print("Enter the number of terms : ");
Scanner sc = new Scanner(System.in);
n = sc.nextInt();
System.out.println("1)"+a);
System.out.println("2)"+b);
for (i=0;i<n-2;i++) {
c=a+b;
a=b;
b=c;
sum+=c;
System.out.println((i+3)+")"+c);
}

System.out.println("Total of fibonaci  is = "+sum);
}
}
  
