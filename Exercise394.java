

public class Exercise394 {
    public static void main(String[] args) {
        Person.Gender m = Person.Gender.MALE;
        Person.Gender f = Person.Gender.FEMALE;
        System.out.println(m);
        System.out.println(f);
    }
}

class Person {
    public enum Gender {
        MALE, FEMALE
    }
}
