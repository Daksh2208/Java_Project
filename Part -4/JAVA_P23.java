interface Shape {
    double area();
    String color();
    String shape();
    default void setDescription() {
    System.out.println("This is a "+shape()+ " with " + color() + " color and area " + area());
    }
    }
    
    class Circle implements Shape {
    double radius;
    String color;
    
    public Circle(double radius, String color) {
    this.radius = radius;
    this.color = color;
    }
    
    public double area() {
    return 3.14 * radius * radius;
    }
    
    public String color() {
    return color;
    }
    public String shape(){
    return "Circle";
    }
    }
    
    class Rectangle implements Shape {
    double length;
    double width;
    String color;
    
    public Rectangle(double length, double width, String color) {
    this.length = length;
    this.width = width;
    this.color = color;
    }
    
    
    public double area() {
    return length * width;
    }
    
    public String color() {
    return color;
    }
    public String shape(){
    return "Rectangle";
    }
    }
    
    class Sign {
    Shape shape;
    String text;
    
    public Sign(Shape shape, String text) {
    this.shape = shape;
    this.text = text;
    }
    
    public void display() {
    System.out.println("Sign text: " + text);
    shape.setDescription();
    }
    }
    
    public class JAVA_P23 {
    public static void main(String[] args) {
    Shape circle = new Circle(5.0, "Red");
    Shape rectangle = new Rectangle(4.0, 6.0, "Blue");
    
    Sign circleSign = new Sign(circle, "Welcome to the Circle Zone");
    Sign rectangleSign = new Sign(rectangle, "Welcome to the Rectangle Zone");
    
    circleSign.display();
    rectangleSign.display();
    }
    }
    
    
    