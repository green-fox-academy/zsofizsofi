public class Pirates {

    private String name;
    private String lifeState;
    private int intoxicated;
    private String status;

    public Pirates(String name) {
        this.name = name;
        this.lifeState = "alive";
        this.intoxicated = 0;
        this.status= "Private";
    }

    public Pirates() {
        this.name = name;
        this.lifeState = "alive";
        this.intoxicated = 0;
        this.status= "Private";
    }

    public String getName() {
        return name;
    }

    public String getLifeState() {
        return lifeState;
    }

    public int getIntoxicated() {
        return intoxicated;
    }

    public String getStatus() {
        return status;
    }

    public void setLifeState(String lifeState) {
        this.lifeState = lifeState;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int drinkSomeRum() {
        return this.intoxicated++;
    }

    public int drinkMoreRum(int numersOfShots) {
        for (int i = 0; i < numersOfShots; i++) {
            intoxicated++;
        }
        return this.intoxicated;
    }

    public void howsItGoingMate() {
        if (this.intoxicated > 4) {
            System.out.println("Pour me anudder!");
        } else {
            System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
        }
    }

    public void die() {
        if (intoxicated > 50) {
            this.lifeState="dead";
            System.out.println(this.name +"'s dead. :((((");
        }
        else {
            System.out.println(this.name + " is still alive.");
        }
    }

    public void brawl(Pirates otherPirate) {
        if (otherPirate.lifeState == "alive") {
            int a = (int) (Math.random() * 3);
            if (a == 0) {
                this.lifeState = "dead";
                System.out.println("Uuups, " + this.name + " died. Pour him.");
            } else if (a == 1) {
                otherPirate.lifeState = "dead";
                System.out.println("Uuups, " + otherPirate.name + " died. Pour him.");
            } else {
                this.lifeState = "dead";
                otherPirate.lifeState = "dead";
                System.out.println("Uuups, " + this.name + " and " + otherPirate.name + " died. Pour them.");
            }
        } else{
            System.out.println("Muhha, dead men can't kill.");
        }
    }
    public void intoxicated(){
        System.out.println(this.getIntoxicated());
    }
}
