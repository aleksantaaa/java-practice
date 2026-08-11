
import java.util.ArrayList;


class Libraryb{

    ArrayList<Bookb> books = new ArrayList<>();

    Libraryb() {

        for ( int i = 0; i < 5; i++) {
            books.add( new Bookb ("", "available"));
        }
    }

    void showBooks() {

        for ( int i = 0; i < 5; i++) {
            System.out.println( books.get(i).name + ", " + books.get(i).status);
        }

    }

    void giveBook(String name) {

        for ( int i = 0; i < 5; i++) {

            if (books.get(i).isAvailable() == true && books.get(i).name.equals(name)) {
                System.out.println( "You can get the book " + books.get(i).name + ".");
            } else if (books.get(i).isAvailable() == false && books.get(i).name.equals(name)) {
                System.out.println( "You can not get this book " + books.get(i).name + ".");
            }
        }
    }

    void takeawayBook(String name) {

        for ( int i = 0; i < 5; i++) {

            if (books.get(i).isAvailable() == false && books.get(i).name.equals(name)) {
                System.out.println( "You have returned the book  " + books.get(i).name + ".");
            } else if (books.get(i).isAvailable() == true && books.get(i).name.equals(name)) {
                System.out.println( "The book " + books.get(i).name + " is not ours.");
            }

        }
    }
}

class Bookb {

    String name;
    String status = "available";

    Bookb (String name, String status) {

        this.name = name;
        this.status = status;

    }

    boolean isAvailable() {

        return status.equals("available");
    }
}

public class LibrarywithBooks {


    public static void main (String[] args) {

        Libraryb lb = new Libraryb();
        lb.showBooks();
        lb.giveBook("Harry Potter");
        lb.takeawayBook("Mermaid");
    }
}
