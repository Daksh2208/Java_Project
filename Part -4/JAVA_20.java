class shape {

    void print(){
    System.out.println("This is This is shape ");
    }
    }
    class Rectangle extends shape{
    
    void print1(){
    System.out.println("This is rectangular shape");
    }
    }
    class Circle extends shape{
    void print2(){
    System.out.println("This is circular shape");
    }
    }
    
    class Square extends Rectangle{
    void print3(){
    System.out.println("Square is a rectangle");
    }
    }
    
    
    public class JAVA_20 {
    public static void main(String[] args) {
    Square s1=new Square();
    s1.print();
    s1.print1();
    }
    }
    