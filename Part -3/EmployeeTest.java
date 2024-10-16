
class Employee {
    private String firstName;
    private String lastName;
    private int monthlySalary;
    
    
    public Employee(String firstName, String lastName, int monthlySalary) {
    this.firstName = firstName;
    this.lastName = lastName;
    
    this.monthlySalary = (monthlySalary > 0) ? monthlySalary : 0;
    }
    
    
    public String getFirstName() {
    return firstName;
    }
    
    
    public void setFirstName(String firstName) {
    this.firstName = firstName;
    }
    
    
    public String getLastName() {
    return lastName;
    }
    
    
    public void setLastName(String lastName) {
    this.lastName = lastName;
    }
    
    
    public int getMonthlySalary() {
    return monthlySalary;
    }
    
    
    public void setMonthlySalary(int monthlySalary) {
    this.monthlySalary = (monthlySalary > 0) ? monthlySalary : 0;
    }
    
    public int getYearlySalary() {
    return monthlySalary * 12;
    }
    
    public void applyRaise() {
    this.monthlySalary *= 1.10;
    }
    }
    public class EmployeeTest {
    public static void main(String[] args) {
    
    Employee employee1 = new Employee("Daksh","Prajapati", 3000);
    Employee employee2 = new Employee("Harsh", "Patel", 3500);
    
    
    System.out.println("Employee 1: " + employee1.getFirstName() + " " + employee1.getLastName());
    System.out.println("Yearly Salary: $" + employee1.getYearlySalary());
    
    System.out.println("Employee 2: " + employee2.getFirstName() + " " + employee2.getLastName());
    System.out.println("Yearly Salary: $" + employee2.getYearlySalary());
    
    
    employee1.applyRaise();
    employee2.applyRaise();
    
    
    System.out.println("\nAfter 10% raise:");
    
    System.out.println("Employee 1: " + employee1.getFirstName() + " " + employee1.getLastName());
    System.out.println("Yearly Salary: $" + employee1.getYearlySalary());
    
    System.out.println("Employee 2: " + employee2.getFirstName() + " " + employee2.getLastName());
    System.out.println("Yearly Salary: $" + employee2.getYearlySalary());
    }
    }
    