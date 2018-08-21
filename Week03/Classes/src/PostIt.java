

public class PostIt {

    String backgroundColor;
    String textOnIt;
    String textColor;


    PostIt(String backgroundColor, String textOnIt, String textColor) {
        this.backgroundColor = backgroundColor;
        this.textOnIt = textOnIt;
        this.textColor = textColor;
    }

    void printPostIt() {
        System.out.println("Background color: " + this.backgroundColor + "Text on it: " + this.textOnIt + "Text color: " + this.textColor);
    }
}


