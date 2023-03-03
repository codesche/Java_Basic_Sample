

class Print {
    void showInfo() {
        System.out.println("인스턴스 메서드입니다.");
    }
}


public class Exercise109 {
    public static void main(String[] args) {
        Print myPrint = new Print();
        myPrint.showInfo();
    }
}
