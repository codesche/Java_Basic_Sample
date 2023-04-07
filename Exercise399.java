
import java.util.EnumSet;
enum Book {
    Java("Java", "2015"),
    C("C", "2013"),
    Internet("Internet", "2012"),
    Cpp("C++", "2014"),
    VB("Visual Basic", "2014"),
    CSharp("Visual C#", "2014");

    private final String title;
    private final String copyrightYear;

    Book(String title, String copyrightYear) {
        this.title = title;
        this.copyrightYear = copyrightYear;
    }

    public String getTitle() {
        return title;
    }

    public String getCopyrightYear() {
        return copyrightYear;
    }

}

public class Exercise399 {
    public static void main(String[] args) {
        System.out.println("All books:");

        for (Book book : Book.values()) {
            System.out.printf("%-10s%-45s%s%n", book,
                    book.getTitle(), book.getCopyrightYear());
        }

        System.out.printf("%nDisplay a range of enum constants:%n");

        for (Book book : EnumSet.range(Book.Java, Book.Cpp)) {
            System.out.printf("%-10s%-45s%s%n", book,
                    book.getTitle(), book.getCopyrightYear());
        }
    }
}
