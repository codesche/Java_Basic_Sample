

class Store {

    public String name;
    public String item;
    public int totalMoney;

    public Store() {
        System.out.println("생성자입니다.");
    }

    public void buy() {
        System.out.println("메서드입니다.");
    }
}


public class Exercise106 {
    public static void main(String[] args) {
        Store store = new Store();
        store.name = "가게1";
        store.item = "상품1";
        store.totalMoney = 1000;
        System.out.println("store.name = " + store.name);
        System.out.println("store.item = " + store.item);
        System.out.println("store.totalMoney = " + store.totalMoney);

        store.buy();
    }
}
