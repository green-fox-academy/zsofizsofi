public class Person {

    String name;
    int age;
    String gender;

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public Person() {
        this.name = "Jane Doe";
        this.age = 30;
        this.gender = "female";

    }

    public void introduce() {
        System.out.print("Hi, I'm " + name + ", a(n) " + age + " years old " + gender);
    }

    public void getGoal() {

        System.out.println();
        System.out.println("My goal is: Live for the moment!");
    }

}


//    Create a Person class with the following fields:
//
//
//        gender: the gender of the person (male / female)
//        And the following methods:
//
//        introduce(): prints out "Hi, I'm name, a age year old gender."
//        getGoal(): prints out "My goal is: Live for the moment!"
//        And the following constructors:
//
//        Person(name, age, gender)
//        Person(): sets name to Jane Doe, age to 30, gender to female