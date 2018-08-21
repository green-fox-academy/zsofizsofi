import java.util.*;

public class MatchMaking {
    public static void main(String... args) {
        ArrayList<String> girls = new ArrayList<String>(Arrays.asList("Eve", "Ashley", "Claire", "Kat", "Jane"));
        ArrayList<String> boys = new ArrayList<String>(Arrays.asList("Joe", "Fred", "Tom", "Todd", "Neef", "Jeff"));
        System.out.println(makingMatches(girls, boys));

        // Write a method that joins the two lists by matching one girl with one boy into a new list
        // Exepected output: "Eve", "Joe", "Ashley", "Fred"...
    }

    public static ArrayList makingMatches(ArrayList<String> making1, ArrayList<String> making2) {
        ArrayList<String> commonList = new ArrayList<>();
        for (int i = 0; i < making1.size(); i++) {

            commonList.add(making1.get(i) + ", " + making2.get(i));
        }
        return commonList;
        }

    }



