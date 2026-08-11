import java.util.ArrayList;

class Inventar {

    ArrayList<Item> inventar = new ArrayList<>();

    Inventar () {
    }

    void addItem (String name, int quantity) {

        inventar.add( new Item (name, quantity));

    }

    void giveInventar (String name) {

        for (int i = 0; i < inventar.size() && inventar.get(i).name.equals(name); i++) {

            if ( inventar.get(i).quantity > 0) {

                inventar.get(i).quantity--;

                System.out.println("Here you have 1 item of " + name + " .");

            } else if ( inventar.get(i).quantity <= 0) {
                System.out.println("Not enough of " + name + " . Can not give it. ");
            }
        }
    }

    void returnInventar (String name) {

        for (int i = 0; i < inventar.size() && inventar.get(i).name.equals(name); i++) {

            inventar.get(i).quantity++;

            System.out.println("You have returned 1 item of " + name + " .");
        }
    }

    void showAll () {

        for (int i = 0; i < inventar.size(); i++) {

            System.out.println( inventar.get(i).quantity + inventar.get(i).name );

        }
    }
}


class Item {

    String name;
    int quantity;

    Item (String name, int quantity) {

        this.name = name;
        this.quantity = quantity;

    }
}

public class InventarItems {

    public static void main (String[] args) {

        Inventar inv = new Inventar();
        inv.addItem ( "ball", 20);
        inv.giveInventar ( "ball" );
        inv.returnInventar ( "ball" );
        inv.showAll();
    }
}