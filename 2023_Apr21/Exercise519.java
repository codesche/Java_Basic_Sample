import java.util.HashMap;
import java.util.Map;

public class Exercise519 {
    public static void main(String[] args) {
        Map<String, Float> quality = new HashMap<>();
        float price1 = 3.00F;
        quality.put("mint", price1);
        float price2 = 2.00F;
        quality.put("near mint", price2);
        float price3 = 1.50F;
        quality.put("very fine", price3);
        float price4 = 1.00F;
        quality.put("fine", price4);
        float price5 = 0.50F;
        quality.put("good", price5);
        float price6 = 0.25F;
        quality.put("poor", price6);
        // set up collection
        Product[] comix = new Product[3];
        comix[0] = new Product("Spider-Man", "1A", "fine", 5_000.00F);
        comix[0].setPrice((Float) quality.get(comix[0].condition));
        comix[1] = new Product("Hulk", "181", "near mint", 240.00F);
        comix[1].setPrice((Float) quality.get(comix[1].condition));
        comix[2] = new Product("Cerebus", "1A", "good", 144.00F);
        comix[2].setPrice((Float) quality.get(comix[2].condition));
        for (int i = 0; i < comix.length; i++) {
            System.out.println("Title: " + comix[i].title);
            System.out.println("Issue: " + comix[i].issueNumber);
            System.out.println("Condition: " + comix[i].condition);
            System.out.println("Price: $" + comix[i].price + "\n");
        }
    }
}

class Product {
    String title;
    String issueNumber;
    String condition;
    float basePrice;
    float price;

    Product(String inTitle, String inIssueNumber, String inCondition, float inBasePrice) {
        title = inTitle;
        issueNumber = inIssueNumber;
        condition = inCondition;
        basePrice = inBasePrice;
    }

    void setPrice(float factor) {
        price = basePrice * factor;
    }
}
