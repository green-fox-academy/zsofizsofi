public class Counter {
    int number;


    Counter(int number) {
        this.number = number;
    }

    Counter() {
        this.number = 0;

    }

    int add(int num) {
        this.number = number + num;
        return number;
    }

    int add() {
        this.number=number+1;
        return number;
    }


}
