import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class DayOne {

    List left = new List();
    List right = new List();

    public static void main(String[] args) {
        String filePath = "C:\\Users\\Ruby\\Documents\\dayOne.txt"; // Replace with your file's path

        try (FileReader fr = new FileReader(filePath);
             BufferedReader br = new BufferedReader(fr)) {

            String line;
            while ((line = br.readLine()) != null) {
                line.split(" ");
            }

        } catch (IOException e) {
            System.err.println("An error occurred while reading the file: " + e.getMessage());
        }
    }
}