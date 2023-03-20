

public class Exercise173 {
    public static void main(String[] args) {
        /* 클래스 객체변수 선언 */
        Car2 carObject;
        carObject = new Car2();

        carObject.set(15);
        System.out.println(carObject.get());

        carObject.set(8);
        System.out.println(carObject.get());
    }
}

class Car2 {
    private int fuel = 0;

    void set(int input1) {
        if (input1 < 10) {
            System.out.println("input1 value less than 10");
        } else {
            fuel = input1;
        }
    }

    int get() {
        return fuel;
    }
}



