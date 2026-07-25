import java.util.ArrayList;

class Contact {

    String name;
    String phone;

    Contact (String name, String phone){

        this.name = name;
        this.phone = phone;
    }
}

class ContactBook {

    ArrayList<Contact> contacts = new ArrayList<>();

    ContactBook(){}

    void addContact (String name, String phone){

        Contact c = new Contact(name, phone);
        contacts.add(c);
    }

    void showContacts (){

        for(int i = 0; i < contacts.size(); i++) {
            System.out.println( contacts.get(i).name + " - " + contacts.get(i).phone);
        }
    }

    void findByName(String name){

        boolean found = false;

        for( int i = 0; i < contacts.size(); i++ ) {

            if (name.equals(contacts.get(i).name)) {
                found = true;
                System.out.println(contacts.get(i).phone);
            }
        }
        if (found == false) {
            System.out.println("Contact is not found");
        }
    }
}

public class Contacts {

    public static void main (String[] args) {

        ContactBook cb = new ContactBook();
        cb.addContact( "Masha", "+380960199271");
        cb.addContact( "Mariia", "+4915147630615");

        cb.showContacts();

        cb.findByName("Masha");
        cb.findByName("Sasha");
    }
}