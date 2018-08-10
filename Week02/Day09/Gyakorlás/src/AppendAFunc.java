

public class AppendAFunc {
    public static void main(String[] args) {
        String typo= "Chinchill";
        String a=appendAFunc(typo);
        System.out.println(a);

    }
    public static String appendAFunc(String b) {

        String c =  b + "a";
        return c;
    }
}

// - Create a string variable named `typo` and assign the value `Chinchill` to it
// - Write a function called `appendAFunc` that gets a string as an input,
//   appends an 'a' character to its end and returns with a string
//
// - Print the result of `appendAFunc(typo)`