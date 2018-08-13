import java.util.Arrays;
public class Colors {
    public static void main(String[] args) {
        String colors[][] = new String[3][]; //{{"lime ", "forest green ", "olive "}, {"orange red ", "red ", "tomato "}, {"orchid ", "violet ", "pink", "hot pink"}};
        colors[0] = new String[]{"lime ", "forest green ", "olive "};
        colors[1] = new String[]{"orange red ", "red ", "tomato "};
        colors[2] = new String[]{"orchid ", "violet ", "pink", "hot pink"};

        for (int i=0; i<=2; i++) {
            //for (int j=0; j<4; j++
                System.out.println(Arrays.deepToString(colors[i]));
            }
            System.out.println();
        }




    }




    //int twoD[][] = new int[4][];
    //twoD[0] = new int[1];
      //      twoD[1] = new int[2];
        //    twoD[2] = new int[3];
          //  twoD[3] = new int[4];


// - Create a two dimensional array
//   which can contain the different shades of specified colors
// - In `colors[0]` store the shades of green:
//   `"lime", "forest green", "olive", "pale green", "spring green"`
// - In `colors[1]` store the shades of red:
//   `"orange red", "red", "tomato"`
// - In `colors[2]` store the shades of pink:
//   `"orchid", "violet", "pink", "hot pink"`