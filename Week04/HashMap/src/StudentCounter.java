import java.util.*;

public class StudentCounter {
    public static void main(String... args) {
        ArrayList<Map<String, Object>> map = new ArrayList<>();

        // Given this list of hashmaps...

        Map<String, Object> row0 = new HashMap<>();
        row0.put("name", "Theodor");
        row0.put("age", 9);
        row0.put("candies", 2);
        map.add(row0);


        Map<String, Object> row1 = new HashMap<String, Object>();
        row1.put("name", "Paul");
        row1.put("age", 10);
        row1.put("candies", 1);
        map.add(row1);

        Map<String, Object> row2 = new HashMap<String, Object>();
        row2.put("name", "Mark");
        row2.put("age", 7);
        row2.put("candies", 3);
        map.add(row2);

        Map<String, Object> row3 = new HashMap<String, Object>();
        row3.put("name", "Peter");
        row3.put("age", 12);
        row3.put("candies", 5);
        map.add(row3);

        Map<String, Object> row4 = new HashMap<String, Object>();
        row4.put("name", "Olaf");
        row4.put("age", 12);
        row4.put("candies", 7);
        map.add(row4);

        Map<String, Object> row5 = new HashMap<String, Object>();
        row5.put("name", "George");
        row5.put("age", 3);
        row5.put("candies", 2);
        map.add(row5);


        int numberOfCandies = 0;
        String names="";
        for (Map<String, Object> s : map) {
            numberOfCandies = (int) s.get("candies");
            names= (String) s.get("name");
            if (numberOfCandies>4) {
                System.out.println(names + ": " + numberOfCandies);
            }

        }


        int numberOfCandies2 = 0;
        String names2;
        int age2 = 0;
        int age;
        for (Map<String, Object> s : map) {
            numberOfCandies2 = (int) s.get("candies");
            names2= (String) s.get("name");
            age= (int) s.get("age");
            if (numberOfCandies2<5) {
                age2+=age;

            }
        }
        System.out.println((double)age2);


        // System.out.println();

        // Display the following things:
        //  - Who has got more candies than 4 candies
        //  - Sum the age of people who have lass than 5 candies
    }

}