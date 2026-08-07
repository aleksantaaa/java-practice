import java.util.ArrayList;

class Good {

    String name;
    double price;
    int quantity;

    Good (String name, double price, int quantity) {

        this.name = name;
        this.price = price;
        this.quantity = quantity;

    }
}

class Shop {

    ArrayList<Good> goods = new ArrayList<>();

    Shop() {}

    void addProduct(String name, double price, int quantity) {
        goods.add(new Good(name, price, quantity));

    }

    void overallPrice() {

        double overallPrice = 0;

        for (int i = 0; i < goods.size(); i++) {
            overallPrice += goods.get(i).quantity * goods.get(i).price;
        }
        System.out.println( overallPrice );
    }

    void thePriciest () {

        double maxPrice = goods.get(0).price;

        for (int i = 0; i < goods.size(); i++) {

            if ( maxPrice < goods.get(i).price ) {
                maxPrice = goods.get(i).price;
            }
        }
        System.out.println( maxPrice );
    }

    void decreasePrice(String name, double discount) {

        for (int i = 0; i < goods.size(); i++) {
            if ( goods.get(i).name.equals(name)) {

                goods.get(i).price = goods.get(i).price - goods.get(i).price*discount;
                System.out.println(goods.get(i).price);

            }
        }
    }
}

public class Shops {

    public static void main ( String[] args ) {

        Shop sh = new Shop();

        sh.addProduct("milk", 2, 20);
        sh.overallPrice();
        sh.thePriciest();
        sh.decreasePrice("milk", 0.25);
    }
}
