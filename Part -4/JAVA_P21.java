class Degree{

    void getdegree(){
    System.out.println("I got a degree ");
    }
    }
    class Undergraduate extends Degree{
    void getDegree(){
    System.out.println("I am an Undergraduate");
    }
    }
    class Postgraduate extends Degree{
    void getDegree(){
    System.out.println("I am a Postgraduate");
    }
    }
    public class JAVA_P21 {
    
    public static void main(String[] args) {
    Degree d1 = new Degree();
    Undergraduate u1 = new Undergraduate();
    Postgraduate p1 = new Postgraduate();
    d1.getdegree();
    u1.getDegree();
    p1.getDegree();
    }
    }
    