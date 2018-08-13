import java.util.Random;

    public class RandNum {

        public static void main(String[] args) {

            Random random = new Random();
            int rand = random.nextInt(1000);
            System.out.print(rand);
        }
}
