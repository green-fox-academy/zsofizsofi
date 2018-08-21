public class AlexMagyaraz {
    String name;
    String [] nickNames;
    int money;
    int age;

    AlexMagyaraz(String name, int money, int age, String [] nickNames)  {
        this.name= name;
        this.money=money;
        this.age=age;
        this.nickNames=nickNames;
    }


    void buy(int money){
        this.money-=money;
    }
}


