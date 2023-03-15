
class Calculator2 {
    int value;

    public Calculator2() {
        this.value = value;
    }

    void add(int val) {
        this.value += val;
    }

    int getValue() {
        return this.value;
    }

}


public class Exercise105 {
    public static void main(String[] args) {
        Calculator2 cal = new Calculator2();
        cal.add(10);
        System.out.println(cal.getValue());
    }
}
