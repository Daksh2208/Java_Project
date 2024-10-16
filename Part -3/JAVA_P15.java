import java.util.Scanner;

class Area{
private double length;
private double breadth;

Area(){

}

Area(double length,double breadth){
this.length=length;
this.breadth=breadth;

}

public void display(){
System.out.printf("Area of reactangle is :  "+(double)Math.round((this.length*this.breadth)*100)/100);
}
}



public class JAVA_P15 {

public static void main(String[] args) {
double a,b;
Scanner sc =new Scanner(System.in);
System.out.print("Enter the length : ");
a=sc.nextDouble();
System.out.print("Enter the breadth : ");
b=sc.nextDouble();

Area a1=new Area(a,b);
a1.display();
}
}
