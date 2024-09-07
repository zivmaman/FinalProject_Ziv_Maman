import java.util.ArrayList;

public class Shelf {
    public ArrayList<Book> books;
    public boolean isShelfFull;
    int maxBook;

    public Shelf() {
        this.books = new ArrayList<>();
        this.isShelfFull = false;
        this.maxBook = 5;
    }

    void addBook(Book book) {
        if (this.books.size() >= this.maxBook) {
            System.out.println("The shelf is full");
            this.isShelfFull = true;
        } else {
            this.books.add(book);
            System.out.println("The book : " + book.title + " is added");

            if (this.books.size() == this.maxBook)
                this.isShelfFull = true;
        }
    }

    void replaceBooks(int num1, int num2) {
        try {
            Book temp = books.get(num1);
            this.books.set(num1, books.get(num2));
            this.books.set(num2, temp);
            System.out.println("The books is replaced");
        } catch (IndexOutOfBoundsException | NullPointerException e) {

        }
    }

}