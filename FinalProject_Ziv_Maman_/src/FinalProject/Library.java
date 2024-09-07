package FinalProject;

import java.util.ArrayList;

public class Library {
    ArrayList<Shelf> shelves;
    ArrayList<Reader> readers;

    public Library() {
        this.shelves = new ArrayList<>();
        this.readers = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            this.shelves.add(new Shelf());
        }
    }

    //Option 1
    public boolean isTherePlaceForNewBook() {
        for (Shelf shelf : this.shelves) {
            if (!shelf.isShelfFull) {
                return true;
            }
        }
        return false;
    }
    //Option 1
    public void addNewBook(Book book) {
        if (!isTherePlaceForNewBook()) {
            System.out.println("The book has not added, the library is full");
            return;
        }
        for (Shelf shelf : shelves) {
            if (!shelf.isShelfFull) {
                shelf.addBook(book);
                return;
            } else {
                System.out.println("The shelf is full");
            }
        }
    }
//Option 2
   /* public void addNewBook(Book book) {
        for (Shelf shelf : shelves) {
            if (!shelf.isShelfFull) {
                shelf.addBook(book);
                return;
            } else {
                System.out.println("The shelf is full");
            }
        }
        System.out.println("The book has not added , library is full");
    }*/

    public void deleteBook(String title) {
        boolean found = false;
        for (Shelf shelf : this.shelves) {
            for (Book book : shelf.books) {
                if (book.title.equals(title)) {
                    shelf.books.remove(book);
                    System.out.println("The book : " + title + " is deleted");
                    found = true;
                    if (shelf.books.size() < shelf.maxBook) {
                        shelf.isShelfFull = false;
                    }
                    break;
                }
            }
            if (found) break;
        }
        if (!found) {
            System.out.println("The book : " + title + " is not fund");
        }
    }
    public void registerReader(String name, int id) {
        Reader newReader = new Reader(id, name);
        readers.add(newReader);
        System.out.println("The new reader : " + newReader.name + " is added");
    }
    public void removeReader(String name) {
        boolean found = false;
        for (Reader reader : readers) {
            if (reader.name.equals(name)) {
                readers.remove(reader);
                System.out.println("The reader : " + reader.name + " is been removed");
                found = true;
                return;
            }
        }
        if (!found) {
            System.out.println("The reader : " + name + " is not found");
        }
    }
    public void searchByAuthor(String authorName) {
        boolean foundBook = false;
        for (Shelf shelf : shelves) {
            for (Book book : shelf.books) {
                if
                (book.author.equals(authorName)) {
                    System.out.println("The book : " + book.title + " is found ");
                    foundBook = true;
                }
            }
        }
        if (!foundBook) {
            System.out.println("No books found by author : " + authorName);
        }
    }
}
