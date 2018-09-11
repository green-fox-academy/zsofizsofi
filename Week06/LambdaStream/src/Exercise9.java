
import javax.xml.stream.events.Characters;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Exercise9 {
    public static void main(String[] args) {
        //Write a Stream Expression to convert a char array to a string!
        Character[] arrayOfChars = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'G', 'G', 'b'};
        char[] arrayOfChars2 = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'G', 'G', 'b'};


        String string2 = Arrays.stream(arrayOfChars)
                .map(Objects::toString)
                .collect(Collectors.joining());

        System.out.println(string2);


        String string = String.valueOf(arrayOfChars2);
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
