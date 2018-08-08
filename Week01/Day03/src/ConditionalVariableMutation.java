public class ConditionalVariableMutation {
    public static void main(String[] args) {
        /*double a = 23;
        int out = 0;
        if (a % 2 == 0) {
            // if a is even increment out by one


            System.out.println(out + 1);
        }*/

       /* int b = 34;
        String out2 = "";
        if (10 <= b && b<= 20) {
            // if b is between 10 and 20 set out2 to "Sweet!"
            // if less than 10 set out2 to "Less!",
            // if more than 20 set out2 to "More!"


            System.out.println(out2 ="Sweet!"); }
        if (b<=10) {
            System.out.println(out2="Less!");

        }
        if (b>20) {
            System.out.println(out2="More!");
        }*/


        /*int c = 45;
        int credits = 30;
        boolean isBonus = true;
        if (credits >= 50 && isBonus == false) {
            System.out.println(c - 2);
        }
        if (credits < 50 && isBonus == false) {
            System.out.println(c - 1);
        }
        if (isBonus == true) {
            System.out.println(c);
        }


        // if credits are at least 50,
        // and isBonus is false decrement c by 2
        // if credits are smaller than 50,
        // and isBonus is false decrement c by 1
        // if isBonus is true c should remain the same */

        int d = 8;
        int time = 20;
        String out3 = "";
        if(d%4==0 && time<=200) {
            out3 ="check";
        }

        if (time> 200) {
            out3 ="Time out";
        }

        else {
            out3 = "Run Forest Run!";
        }
        // if d is dividable by 4
        // and time is not more than 200
        // set out3 to "check"
        // if time is more than 200
        // set out3 to "Time out"
        // otherwise set out3 to "Run Forest Run!"


        {System.out.println(out3);}

    }
}

