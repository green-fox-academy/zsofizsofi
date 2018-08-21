public class MainPostIt {
    public static void main(String[] args) {
        PostIt postIt = new PostIt("black ", "blabla", "green");
        PostIt postIt2 = new PostIt("orange", "idea 1", "blue");
        PostIt postIt3 = new PostIt ("pink", "Awesome", "black");
        PostIt postIt4 = new PostIt ("yellow", "Superb!", "green");
        postIt.printPostIt();
        postIt2.printPostIt();
        postIt3.printPostIt();
        postIt4.printPostIt();


    }


}


//    Create a PostIt class that has
//        a backgroundColor
//        a text on it
//        a textColor
//        Create a few example post-it objects:
//        an orange with blue text: "Idea 1"
//        a pink with black text: "Awesome"
//        a yellow with green text: "Superb!"