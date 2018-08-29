import java.util.List;

public class SharpieMain {
    public static void main(String[] args) {

        Sharpie sharpie = new Sharpie("green", 20);
        sharpie.setInkAmount(0);
        Sharpie sharpie1 = new Sharpie("blue", 10);
        Sharpie sharpie2 = new Sharpie("yellow", 15);
        Sharpie sharpie3 = new Sharpie("red", 22);
        Sharpie sharpie4 = new Sharpie("black", 12);

        SharpieSet sharpieSet = new SharpieSet();

        sharpieSet.addSharpie(sharpie);
        sharpieSet.addSharpie(sharpie1);
        sharpieSet.addSharpie(sharpie2);
        sharpieSet.addSharpie(sharpie3);
        sharpieSet.addSharpie(sharpie4);
        sharpieSet.addSharpie(new Sharpie("white", 17));

        System.out.println(sharpieSet.countUsable());
        //System.out.println(sharpieSet.removeTrash()); // szeretném kinyomtatni a megmaradt tollak színeit listában
        System.out.println(sharpie1.getInkAmount2());

        System.out.println(sharpie.color);
        System.out.println(sharpie2);
        System.out.println(sharpie4.getInkAmount2());
    }
}
