import java.util.ArrayList;

class Student {

    String name;
    int amount;

    Student(String name) {

        this.name = name;
        this.amount = 0;
    }
}

class Manager {

    ArrayList<Student> students = new ArrayList<>();

    Manager () {}

    void addStudent (String name) {

        students.add( new Student ( name));
    }

    void checkPresence (String name) {

        for ( int i = 0; i < students.size() && students.get(i).name.equals(name); i++) {
            students.get(i).amount++;
            System.out.println(students.get(i).amount);

        }


    }

    void percentage (String name) {

        for ( int i = 0; i < students.size() && students.get(i).name.equals(name); i++) {

            int percentage = students.get(i).amount / 20;

            System.out.println(percentage);
        }
    }

    void minimum () {

        String minName = students.get(0).name;

        int minimum = students.get(0).amount;

        for ( int i = 0; i < students.size(); i++) {

            if ( minimum > students.get(i).amount) {

                minimum = students.get(i).amount;
                minName = students.get(i).name;

            }

        }
        System.out.println(minimum + minName);

    }
}
public class CheckPresence {
    public static void main(String[] args) {
        Manager mgr = new Manager();
        mgr.addStudent("Mariia");
        mgr.checkPresence("Mariia");
        mgr.percentage("Mariia");
        mgr.minimum();
    }
}
