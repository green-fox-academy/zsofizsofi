import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class Logs {
    public static void main(String[] args) {
        System.out.println(ratio("log.txt"));
    }

    public static double ratio(String name) {
        try {
            Path filePath = Paths.get("log.txt");
            List<String> lines = Files.readAllLines(filePath);
            int j = 0;
            int k = 0;
            for (int i = 0; i < lines.size(); i++) {
                if (lines.get(i).contains("GET")) {
                    j++;
                } else {
                    k++;
                }
            }
            System.out.println(j);
            System.out.println(k);
            return (double) k / j;
        } catch (Exception e) {
            return 0;
        }
    }
}


// Read all data from 'log.txt'.
// Each line represents a log message from a web server
// Write a function that returns an array with the unique IP adresses.
// Write a function that returns the GET / POST request ratio.