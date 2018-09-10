
import javax.xml.stream.events.Characters;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Exercise9 {
    public static void main(String[] args) {
        //Write a Stream Expression to convert a char array to a string!
        char[] arrayOfChars = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'G', 'G', 'b'};


        String string = String.valueOf(arrayOfChars);
        String string1 = Arrays.toString(arrayOfChars);
        
        System.out.println(string);
        System.out.println(string1);

//        List<Character> listArray = Character.asList(arrayOfChars);
//        Stream <Character> charStream = new String(arrayOfChars)
//                .chars()
//                .mapToObj(i->(char)i);
//
//        System.out.println(charStream);
    }

}
