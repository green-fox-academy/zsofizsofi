import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.List;

public class PrintEachLine {
    public static void main(String[] args) {
        try {
            Path filePath = Paths.get("text.txt");
            List<String> lines = Files.readAllLines(filePath);
            for (int i = 0; i <lines.size() ; i++) {
                System.out.println(lines.get(i));
            }
        } catch (Exception e) {
            System.out.println("Uh-oh, could not read the file!");
        }
    }


    // Write a program that opens a file called "my-file.txt", then prints
    // each of the lines form the file.
    // If the program is unable to read the file (for example it does not exists),
    // then it should print an error message like: "Unable to read file: my-file.txt"


}
