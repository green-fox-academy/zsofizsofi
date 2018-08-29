import java.util.List;

public class SharpieMain {
    public static void main(String[] args) {



        Sharpie sharpie = new Sharpie("green", 20 );
        Sharpie sharpie1 = new Sharpie("blue", 10 );
        Sharpie sharpie2 = new Sharpie("yellow", 15 );
        Sharpie sharpie3 = new Sharpie("red", 22 );
        Sharpie sharpie4 = new Sharpie("black", 12 );

        SharpieSet list = new SharpieSet();

        System.out.println(list);


        System.out.println(sharpie.getInkAmount());
        System.out.println(sharpie3);
    }
}
