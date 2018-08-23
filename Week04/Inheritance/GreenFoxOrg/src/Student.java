public class Student extends Person {


    private String previousOrganization;
    private int skippedDays;

    public Student(String name, int age, String gender, String previousOrganization) {
        super(name, age, gender);
        this.previousOrganization = previousOrganization;
        this.skippedDays = 0;
    }

    public Student() {
//        this.name= "Jane Doe";
//        this.age = 30;
//        this.gender = "female";
        this.previousOrganization = "The School of Life";
        this.skippedDays = 0;

    }

    @Override
    public void introduce() {
        super.introduce();
        System.out.print(" from " + previousOrganization + " who skipped " + skippedDays + " days from the course already.");
    }

    @Override
    public void getGoal() {
        System.out.println();
        System.out.println("My goal is: Be a junior software developer.");
    }

    public int skipDays(int numberOfDays) {
        skippedDays += numberOfDays;
        return skippedDays;

    }
}


//    Create a Student class that has the same fields and methods as the Person class, and has the following additional
//
//        fields:
//        previousOrganization: the name of the student’s previous company / school
//        skippedDays: the number of days skipped from the course
//        methods:
//        getGoal(): prints out "Be a junior software developer."
//        introduce(): "Hi, I'm name, a age year old gender from previousOrganization who skipped skippedDays days from the course already."
//        skipDays(numberOfDays): increases skippedDays by numberOfDays
//        The Student class has the following constructors:
//
//        Student(name, age, gender, previousOrganization): beside the given parameters, it sets skippedDays to 0
//        Student(): sets name to Jane Doe, age to 30, gender to female, previousOrganization to The School of Life, skippedDays to 0