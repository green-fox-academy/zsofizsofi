import java.util.Arrays;

public class AppendA {
    public static void main(String[] args) {
        String animal[] = {"koal","pand","zebr" };
        for (int i = 0; i < animal.length; i++) {
            animal[i]= animal[i] + "a";
        }
        System.out.print(Arrays.toString(animal));
    }
}


// - Create an array variable named `animals`
//   with the following content: `["koal", "pand", "zebr"]`
// - Add all elements an `"a"` at the end