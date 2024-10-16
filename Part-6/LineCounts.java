
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LineCounts {
    public static void main(String[] args) {
        for (String fileName : args) {
            try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
                int lineCount = 0;
                while (reader.readLine() != null) {
                    lineCount++;
                }
                System.out.println(fileName + ": " + lineCount + " lines");
            } catch (IOException e) {
                System.out.println("Error reading " + fileName + ": " + e.getMessage());
            }
        }
    }
}
