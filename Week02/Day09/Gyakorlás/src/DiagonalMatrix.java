public class DiagonalMatrix {
    public static void main(String[] args) {
       int a=4;
       int b=4;
       int array [][]= new int [a][b];
       for (int i=1; i<=a; i++) {
           for( int j=1; j<=b; j++)
              if (i==j) {
                  System.out.print("1");
              }
              else {
                  System.out.print("0");
              }
             System.out.println();
       }


    }
}


// - Create (dynamically) a two dimensional array
//   with the following matrix. Use a loop!
//
//   1 0 0 0
//   0 1 0 0
//   0 0 1 0
//   0 0 0 1
//
// - Print this two dimensional array to the output
