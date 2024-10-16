
class parent{

    public void display(){
    System.out.println("This is parent class");
    }
    
    }
    class child extends parent{
    public void cdisplay(){
    System.out.println("This is child class");
    }
    }
    
    
    
    
    public class JAVA_P17 {
    
    public static void main(String[] args) {
    
    parent p1=new parent();
    p1.display();
    child c1=new child();
    c1.cdisplay();
    
    }
    }
    