import java.util.ArrayList;

class Cinema {

    ArrayList<Seat> seats = new ArrayList<>();

    Cinema () {

        for (int i=0; i < 10; i++) {
            seats.add( new Seat (i, ""));
        }
    }

    void showAvailability () {

        for (int i=0; i < 10; i++) {
            if (seats.get(i).hasName() == false) {
                System.out.println("There is a free seat: " + seats.get(i).number);
            } else if (seats.get(i).hasName() == true) {
                System.out.println("There is no free seat");
            }
        }
    }

    void makeBooking (String name, int number) {

        for (int i=0; i < 10; i++) {
            if (seats.get(i).hasName() == false && seats.get(i).number == number) {
                seats.get(i).name = name;
            } else if (seats.get(i).hasName() == true && seats.get(i).number == number) {
                System.out.println("There is no free seat");
            }
        }
    }


    void deleteBooking (String name, int number) {

        for (int i=0; i < 10; i++) {
            if (seats.get(i).hasName() == true && seats.get(i).number == number) {
                seats.get(i).name = "";
            } else if (seats.get(i).hasName() == false && seats.get(i).number == number) {
                System.out.println("The place has been not booked");
            }
        }
    }
}

class Seat {

    int number;
    String name;

    Seat (int number, String name) {

        this.number = number;
        this.name = name;
    }

    boolean hasName() {
        return !name.equals("");
    }

}

public class CinemaClass {

    public static void main (String[] args) {
        Cinema cm = new Cinema();
        cm.showAvailability();
        cm.makeBooking("Sasha", 1);
        cm.deleteBooking("Masha", 2);
    }
}

