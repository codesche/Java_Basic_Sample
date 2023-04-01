

class Clone implements Cloneable {
    int a;

    Clone(int a) {
        this.a = a;
    }
}

public class Exercise342 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Clone c = new Clone(10);
        System.out.println(c.a);
    }
}
