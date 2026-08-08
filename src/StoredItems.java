import java.util.HashMap;

class Stored {
    HashMap<String, Integer> items = new HashMap<>();

    Stored () {}

    void addItem (String name, int quantity) {

        items.put(name, quantity);
    }

    void increaseAmount (String name, int quantity) {

        int current = items.get(name);
        current += quantity;
        items.put(name, current);
    }

    void decreaseAmount (String name, int quantity) {

        int start = items.get(name);
        int difference = 0;

        if ( start - quantity >= 0 ) {

            difference = start - quantity;
            System.out.println(difference);

            items.put(name, difference);

        } else if ( start - quantity < 0 ) {

            System.out.println("Below 0");
        }
    }


    void allItems () {

        for (String key : items.keySet()) {

            System.out.println (key + ": " + items.get(key));

        }
    }
}

public class StoredItems {

    public static void main(String[] args) {

        Stored st = new Stored();
        st.addItem("milk", 20);
        st.addItem("juice", 30);

        st.increaseAmount("milk", 10);
        st.decreaseAmount("juice", 31);
        st.allItems();

    }
}