import java.util.Scanner;

//ezen még sokat kell dolgoznom. Új sorba printelés!!!

class DrawDiagonal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int userInput = scan.nextInt();
        String cucc = "";
        String szünet = "";
        for (int i = 0; i <= userInput; i++) {
            if (i == 0) {
                for (int j = 0; j <= userInput; j++) {
                    cucc += "%";
                    System.out.print(cucc);
                    cucc = "";
                }
            }
            System.out.println();

            if (i > 0 && i != userInput-1) {
                for (int m=0; m<=userInput-3;m++ ) {


                    for (int k = 0; k <= userInput - 3; k++) {
                        szünet += " ";
                        System.out.print("%" + szünet + "%");
                        szünet ="";



                    }
                    System.out.println();
                }
                System.out.println();

                if (i == userInput)
                    for (int n = 0; n <= userInput; n++) {
                        cucc += "%";
                        System.out.print(cucc);
                        cucc = "";
                    }
            }
        }
    }
}

