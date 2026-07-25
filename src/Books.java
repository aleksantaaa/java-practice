import java.util.ArrayList;

class Book {

    String title;
    String author;

    Book(String title, String author) {

        this.title = title;
        this.author = author;

    }
}

class Library {

    Library() {}

    ArrayList<Book> books = new ArrayList<>();

    void addBook(String title, String author) {

        Book b = new Book( title, author );
        books.add(b);
    }

    void showBooks() {

        for (int i=0; i < books.size(); i++) {
            System.out.println( books.get(i).title + " - " + books.get(i).author );
        }
    }
}

public class Books {

    public static void main(String[] args) {

        Library l = new Library();

        l.addBook("Гарри Поттер 1", "Джоан Роулинг");
        l.addBook("Гарри Поттер 2", "Джоан Роулинг");
        l.addBook("Гарри Поттер 3", "Джоан Роулинг");

        l.showBooks();

    }
}