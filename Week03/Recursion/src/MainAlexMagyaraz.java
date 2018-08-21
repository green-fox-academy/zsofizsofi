public class MainAlexMagyaraz {
    public static void main(String[] args) {
        String [] stringArray= {"ale", "ali"};
        AlexMagyaraz alex= new AlexMagyaraz("Krisztián", 1000, 27, stringArray );
        alex.buy(100);
        System.out.println(alex.money);
        System.out.println(alex.nickNames[0]);

    }
}
