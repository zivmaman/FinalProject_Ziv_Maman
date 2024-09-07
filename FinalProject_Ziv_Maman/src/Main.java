import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);
        int num;
        library.shelves.get(0).addBook(new Book("Mark Douglas", "Trading in the Zone", 200));
        library.shelves.get(0).addBook(new Book("Robert Kiyosakis", "Rich Dad Poor Dad", 336));

        library.shelves.get(1).addBook(new Book("Robert Kiyosakis", "Financial IQ", 200));
        library.shelves.get(1).addBook(new Book("Benjamin Graham", "The Intelligent Investor", 640));
        library.shelves.get(2).addBook(new Book("Daniel Kahneman", "Thinking, Fast and Slow", 499));
        library.shelves.get(2).addBook(new Book("Ray Dalio", "Principles: Life and Work", 592));
        do {
            System.out.println("Menu:");
            System.out.println("1. Add a book");
            System.out.println("2. Delete a book");
            System.out.println("3. Register a new reader");
            System.out.println("4. Remove a reader");
            System.out.println("5. Search books by author");
            System.out.println("6. Exit");
            System.out.println("Choose an option: ");
            num = scanner.nextInt();
            scanner.nextLine();

            switch (num) {
                case 1:
                    System.out.println("Enter a book title");
                    String title = scanner.nextLine();
                    System.out.println("Enter a author ");
                    String author = scanner.nextLine();
                    System.out.println("Enter num of pages");
                    int nop = scanner.nextInt();
                    scanner.nextLine();
                    library.addNewBook(new Book(author, title, nop));
                    break;

                case 2:
                    System.out.println("Enter title of book to delete");
                    title = scanner.nextLine();
                    library.deleteBook(title);
                    break;

                case 3:
                    System.out.println("Enter reader name");
                    String name = scanner.nextLine();
                    System.out.println("Enter a id");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    library.registerReader(name, id);
                    break;
                case 4:
                    System.out.println("Enter reader name to remove");
                    name = scanner.nextLine();
                    library.removeReader(name);
                    break;

                case 5:
                    System.out.println("Enter a author to search book");
                    name = scanner.nextLine();
                    library.searchByAuthor(name);
                    break;

                case 6:
                    break;

                default:
                    System.out.println("Invalid number, please try again");
                    break;


            }

        } while (num != 6);
    }
}
