public class JAVA_25 {
    public static void main(String[] args) {
        int a[]=new int[5];

        try{
            a[5]=10;
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
    }
}
