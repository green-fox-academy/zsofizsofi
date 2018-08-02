public class Cuboid {
        public static void main(String[] args) {
            double a = 3;
            double b = 2;
            double c = 5;
            System.out.println("Surface area: " + 2*(a*b+a*c+b*c));
            double d = 2*(a*b+a*c+b*c);
            System.out.println("Surface area: " + d);
            System.out.println("Volume: " + a*b*c);
            double e = a*b*c;
            System.out.println("Volume: " + e);

        }
    }