

public class Exercise169 {
    public static void main(String[] args) {
        Car3 carObject;
        carObject = new Car3();

        carObject.set(15);
        System.out.println(carObject.get());
    }
}

class Car3 {
    private int fuel;

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