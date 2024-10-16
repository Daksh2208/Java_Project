
import java.util.Scanner;

class complex{
private float real;
private float imaginary;


complex(){

}

complex(float real,float imaginary){
this.real=real;
this.imaginary=imaginary;
}

public complex(complex other) {
this.real = other.real;
this.imaginary = other.imaginary;
}


public float getreal() {
return real;
}

public void setreal(float real) {
this.real = real;
}


public float getimaginary() {
return imaginary;
}

public void setlength(float imaginary) {
this.imaginary = imaginary;
}

public complex add(complex other){
complex temp =new complex();
temp.real=this.real+other.real;
temp.imaginary=this.imaginary+other.imaginary;
return (temp);

}
public complex substraction(complex other){
complex temp =new complex();
temp.real=this.real-other.real;
temp.imaginary=this.imaginary-other.imaginary;
return (temp);

}
public complex multiplication(complex other){
complex temp =new complex();
temp.real=this.real * other.real - this.imaginary * other.imaginary;
temp.imaginary=this.real * other.imaginary + this.imaginary * other.real;
return (temp);

}
public complex divide(complex other){
complex temp =new complex();
float denominator = other.real * other.real + other.imaginary * other.imaginary;
temp.real=(this.real * other.real + this.imaginary * other.imaginary) / denominator;
temp.imaginary=(this.imaginary * other.real - this.real * other.imaginary) / denominator;
return (temp);

}
public void display(){
System.out.println(real+"+"+imaginary+"i");
}
}


public class JAVA_P16 {

public static void main(String[] args) {

float real1,imaginary1;
float real2,imaginary2;
int x;
Scanner sc=new Scanner(System.in);
System.out.print("Enter the real part of A : ");
real1=sc.nextFloat();
System.out.print("Enter the imaginary part of A : ");
imaginary1=sc.nextFloat();
System.out.print("Enter the real part of B : ");
real2=sc.nextFloat();
System.out.print("Enter the imaginary part of B : ");
imaginary2=sc.nextFloat();
complex c1= new complex(real1,imaginary1);
complex c2= new complex(real2,imaginary2);
complex c3;

System.out.println("1)Addition\n2)Subtraction\n3)Multiplication\n4)Division\n");
System.out.print("Enter your choice : ");
x=sc.nextInt();
switch (x) {
case 1:

c3=c1.add(c2);
c3.display();
break;
case 2:

c3=c1.substraction(c2);
c3.display();
break;
case 3:

c3=c1.multiplication(c2);
c3.display();
break;
case 4:

c3=c1.divide(c2);
c3.display();
break;
default:

}

}
}

