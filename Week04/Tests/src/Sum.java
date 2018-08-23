import java.util.ArrayList;

public class Sum {


    public int sum(ArrayList<Integer> numbers) {
        int sumOfNums = 0;

        if (numbers==null) {

            throw new NullPointerException();

        } else {


            for (int i = 0; i < numbers.size(); i++) {
                sumOfNums += numbers.get(i);
            }
            return sumOfNums;
        }


//        int sumOfNums = 0;
//        for (Integer j: numbers) {
//            sumOfNums += j;
//            return sumOfNums;
//        }


    }
}


//    Create a sum method in your class which has an ArrayList of Integers as parameter
//        It should return the sum of the elements in the list
//        Follow these steps:
//        Add a new test case
//        Instantiate your class
//create a list of integers
//                use the assertEquals to test the result of the created sum method
//                Run them
//                Create different tests where you
//                test your method with an empyt list
//                with a list with one element in it
//                with multiple elements in it
//                with a null
//        Run them
//        Fix your code if needed
