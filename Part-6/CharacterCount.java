
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CharacterCount {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Usage: java CharacterCount <character> <filename>");
            return;
        }
        
        char targetChar = args[0].charAt(0);
        String fileName = args[1];
        int count = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            int ch;
            while ((ch = reader.read()) != -1) {
                if (ch == targetChar) {
                    count++;
                }
            }
            System.out.println("The character '" + targetChar + "' appears " + count + " times in " + fileName);
        } catch (IOException e) {
            System.out.println("Error reading " + fileName + ": " + e.getMessage());
        }
    }
}
