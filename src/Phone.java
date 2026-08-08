import java.util.HashMap;

public class Phone {
    public static void main(String[] args) {
        HashMap<String, String> contacts = new HashMap<>();

        contacts.put("Sasha", "123456");
        contacts.put("Kirill", "0293");
        contacts.put("Lisa", "555444");
        contacts.put("Katia", "293");
        System.out.println("Номер Sasha: " + contacts.get("Sasha"));

        System.out.println(contacts.get("K"));

        System.out.println("Есть ли Max? " + contacts.containsKey("Max"));

        System.out.println("Все контакты:");
        for (String key : contacts.keySet()) {
            System.out.println(key + ": " + contacts.get(key));
        }
    }
}