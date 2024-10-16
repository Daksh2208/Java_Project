class Rectangle {
    float length;
    float breadth;
    
    public Rectangle(float length, float breadth) {
    this.length = length;
    this.breadth = breadth;
    }
    
    void areaOfRectangle() {
    System.out.println("Area of rectangle is : " + (this.length * this.breadth));
    }
    
    void perimeterOfRectangle() {
    System.out.println("Perimeter of rectangle is : " + (2 * (this.length + this.breadth)));
    }
    }
    
    class Square extends Rectangle {
    public Square(float side) {
    super(side, side);
    }
    
    @Override
    void areaOfRectangle() {
    System.out.println("Area of square is : " + (this.length * this.length));
    }
    
    @Override
    void perimeterOfRectangle() {
    System.out.println("Perimeter of square is : " + (4 * this.length));
    }
    }
    
    public class JAVA_P19 {
    public static void main(String[] args) {
    Rectangle[] shapes = new Rectangle[2];
    shapes[0] = new Rectangle(12, 24);
    shapes[1] = new Square(10);
    
    for (Rectangle shape : shapes) {
    shape.areaOfRectangle();
    shape.perimeterOfRectangle();
    System.out.println();
    }
    }
    }
    