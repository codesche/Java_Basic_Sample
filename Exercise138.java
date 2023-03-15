


class Student {
    // 필드(Field)
    static String name;
    static int age;
    static int korean_score;
    static int math_score;
    static int english_score;

    // 생성자(Constructor)

    public Student(String name, int age, int korean_score, int math_score, int english_score) {
        this.name = name;
        this.age = age;
        this.korean_score = korean_score;
        this.math_score = math_score;
        this.english_score = english_score;
    }

    public static void PrintScore() {
        System.out.println("이름 : " + name);
        System.out.println("나이 : " + age);
        System.out.println("국어성적 : " + korean_score);
        System.out.println("수학성적 : " + math_score);
        System.out.println("영어성적 : " + english_score);
    }

}


public class Exercise138 {
    public static void main(String[] args) {
        Student student1 = new Student("홍길동", 18, 100, 90, 80);
    }
}
