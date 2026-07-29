import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

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

        for (int i = 0; i < books.size(); i++) {
            System.out.println(books.get(i).title + " - " + books.get(i).author);
        }
    }
        void saveToFile (String filename) {

            try {

                FileWriter writer = new FileWriter(filename);

                for (int i=0;  i < books.size(); i++) {

                    writer.write( books.get(i).title + ";" + books.get(i).author + "\n");

                }

                writer.close();

            } catch ( IOException e) {

                System.out.println("There is a failure with saving: " + e.getMessage());

            }
        }

        void loadFromFile (String filename) {

            try {

                File file = new File(filename);
                Scanner reader = new Scanner(file);


                while ( reader.hasNextLine()) {

                    String line = reader.nextLine();

                    String[] parts = line.split(";");

                    Book newBook = new Book(parts[0], parts[1]);
                    books.add(newBook);

                }

            } catch (IOException e) {

                System.out.println("There is a problem with loading the file: " + e.getMessage());

            }
        }
    }






    public class Books {

        public static void main(String[] args) {

            Library l = new Library();

            l.addBook("Гарри Поттер 1", "Джоан Роулинг");
            l.addBook("Гарри Поттер 2", "Джоан Роулинг");
            l.addBook("Гарри Поттер 3", "Джоан Роулинг");

            l.saveToFile("library.txt");
            l.loadFromFile("library.txt");
            l.showBooks();

        }
    }

