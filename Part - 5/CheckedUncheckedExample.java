import java.io.*;

public class CheckedUncheckedExample {

    public static void readFile(String filePath) throws IOException {
        FileReader file = new FileReader(filePath);
        BufferedReader br = new BufferedReader(file);
        System.out.println(br.readLine());
        br.close();
    }

    public static void main(String[] args) {
        try {
            int a = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Unchecked Exception caught: " + e);
        }

        try {
            String str = null;
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("Unchecked Exception caught: " + e);
        }

        try {
            readFile("nonexistentfile.txt");
        } catch (IOException e) {
            System.out.println("Checked Exception caught: " + e);
        }

        try {
            Class.forName("UnknownClass");
        } catch (ClassNotFoundException e) {
            System.out.println("Checked Exception caught: " + e);
        }
    }
}

