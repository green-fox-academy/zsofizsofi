import java.util.ArrayList;
        import java.util.List;

public class MainDominoes {
    public static void main(String[] args) {
        List<Dominoes> dominoes = initializeDominoes();
        // You have the list of Dominoes
        // Order them into one snake where the adjacent dominoes have the same numbers on their adjacent sides
        // eg: [2, 4], [4, 3], [3, 5] ...

        System.out.println(dominoes);
    }

    static List<Dominoes> initializeDominoes() {
        List<Dominoes> dominoes = new ArrayList<>();
        dominoes.add(new Dominoes(5, 2));
        dominoes.add(new Dominoes(4, 6));
        dominoes.add(new Dominoes(1, 5));
        dominoes.add(new Dominoes(6, 7));
        dominoes.add(new Dominoes(2, 4));
        dominoes.add(new Dominoes(7, 1));

        return dominoes;


//        int i;
//        int j;
//        for (i=0; i<dominoes.size(); i++); {
//
//            List<Dominoes> newDominoes= new ArrayList<>();
//            list.add
//
//            do
//                while
//                ( if (dominoes.get(i).getValues()[1] != dominoes.get(i+1).getValues()[0]) {
//                dominoes.get(i).swapWith(dominoes(i+1));)
//            for (j=0; j<dominoes.size()-i-1; j++)
//            if
//            }
//        }



    }

   // dominoes.get(i)= i-edik elem a listából
    //getValue()[0]= első eleme a lista első elemének
    //d.get.getV Collection.swap


}