import java.util.Scanner;

class Member {
String name;
int age;
long phone_number;
String address;
int salary;

void getData(Scanner sc) {
System.out.print("Enter the name: ");
name = sc.next();
System.out.print("Enter the age: ");
age = sc.nextInt();
System.out.print("Enter the phone number: ");
phone_number = sc.nextLong();
sc.nextLine(); // Consume the newline character left by nextLong()
System.out.print("Enter the address: ");
address = sc.nextLine();
System.out.print("Enter the salary: ");
salary = sc.nextInt();
}

void putData() {
System.out.println("Employee's name         : " + name);
System.out.println("Employee's age          : " + age);
System.out.println("Employee's Phone number : " + phone_number);
System.out.println("Employee's address      : " + address);
}

void printSalary() {
System.out.println("Employee's salary       : " + salary);
}
}

class Employee extends Member {
String specialization;

@Override
void getData(Scanner sc) {
super.getData(sc);
System.out.print("Enter the specialization: ");
specialization = sc.next();
}

@Override
void putData() {
super.putData();
System.out.println("Specialization is       : " + specialization);
}
}

class Manager extends Member {
String department;

@Override
void getData(Scanner sc) {
super.getData(sc);
System.out.print("Enter the department: ");
department = sc.next();
}

@Override
void putData() {
super.putData();
System.out.println("Department is           : " + department);
}
}

public class JAVA_P18 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

System.out.println("1) Employee \n2) Manager");
int n = sc.nextInt();

switch (n) {
case 1:
Employee e1 = new Employee();
e1.getData(sc);
System.out.println();
e1.putData();
e1.printSalary();
break;

case 2:
Manager m1 = new Manager();
m1.getData(sc);
System.out.println();
m1.putData();
m1.printSalary();
break;

default:
System.out.println("Invalid choice.");
break;
}

sc.close();
}
}
