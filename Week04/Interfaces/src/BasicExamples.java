public class BasicExamples {

    public interface Moveable {
        void move(int meter);
    }

    public class Car implements Moveable {
        public int distanceTaken;

        public Car() {
            distanceTaken = 0;
        }

        @Override
        public void move(int meter) {
            distanceTaken += meter;
        }
    }

    public static void main(String... args) {
        Car c = new Car();
        c.move(100);
        System.out.println(c.distanceTaken);

        Movable something = new Car();
        something.move(200);
        System.out.println(((Car)something).distanceTaken);
    }
}
