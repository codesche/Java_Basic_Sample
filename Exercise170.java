
class Car {
    private int currentSpeed;
    private int accelerationTime;

    public void accelerate(int speed, int second) {
        System.out.println(second + "초간 속도를 시속 " + speed + "(으)로 가속함!!");
    }

}

public class Exercise170 {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.accelerate(60, 3);
    }
}
