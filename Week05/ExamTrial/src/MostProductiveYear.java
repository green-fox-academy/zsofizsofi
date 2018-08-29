import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class MostProductiveYear {


    public static void main(String[] args) {
       year("marvel");
    }

    public static void year(String studioName) {
        System.out.println(studioName +" has made the most movies in " + findYears("marvel").get(findMostProductiveYear(findYears("marvel"))));
    }

    public static int findMostProductiveYear(List<String> list){
        int actualYearCount=0;
        int actualMax=0;
        int actualIndex=0;
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                if (list.get(i).equals(list.get(j))){
                    actualYearCount++;
                }
            }
            if(actualYearCount>actualMax) {
                actualMax=actualYearCount;
                actualIndex=i;
            }
            actualYearCount=0;
        }
        return actualIndex;
    }

    public static List<String> findYears(String studioName) {
        try {
            Path filePath = Paths.get(studioName+".csv");
            List<String> lines = Files.readAllLines(filePath);
            List <String> years = new ArrayList<>();
            for (int i = 0; i < lines.size(); i++)
            {
                String[] linePart = lines.get(i).split(",");
                years.add(linePart[1]);
            }

            return years;

        } catch (Exception e) {
            System.out.println("Cannot find studio, please try again later.");
        }
        return null;
    }
}

/**
 * Write a method that helps you find the most productive year for a film studio.
 * The method should take one argument, which is the name of the film studio.
 * The method should try to open the related data file named `studioname`.csv,
 * which is a comma separated file with 3 columns: name of the movie, release year, director
 * <p>
 * - If we do not have any data about the studio, the method should return an error message.
 * - If we have found data, the method should return an information message about the most productive year for that studio.
 * <p>
 * Examples:
 * <p>
 * If we call the method with 'marvel':
 * should return 'marvel has made the most movies in 2017.'
 * <p>
 * If we call the method with 'ghibli':
 * should print 'Cannot find studio, please try again later.'
 * <p>
 * Hint:
 * - You can find some example files in this folder (marvel.csv and paramount.csv)
 * - Most productive year: The year in which the studio has made the most movies.
 */
