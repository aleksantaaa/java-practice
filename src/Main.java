import java.util.ArrayList;

class Languages {

    ArrayList<String>  languages = new ArrayList<>();

    Languages() {}

    void printOut () {

        for (int i=0; i < languages.size(); i++) {
            System.out.println( i+1 + ". " + languages.get(i));
        }
    }

    public static void main(String[] args) {

        Languages l = new Languages();
        l.languages.add("C");
        l.languages.add("Java");
        l.languages.add("JavaScript");

        l.printOut();
    }
}