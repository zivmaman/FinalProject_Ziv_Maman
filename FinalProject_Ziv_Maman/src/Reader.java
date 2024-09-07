import java.util.ArrayList;

public class Reader {
    int id;
    String name;
    public ArrayList<String> books;

    public Reader(int id, String name) {
        this.id = id;
        this.name = name;
        this.books = new ArrayList<>();
    }

    void readBook(String title) {
        if (title != null) {
            this.books.add(title);
            System.out.println("The book " + title + " is added to reading list");
        } else {
            System.out.println("The book has not been added to the reading list");
        }
    }

}