import java.io.IOException;
import java.io.FileWriter;
import java.io.File;
import java.util.Scanner;


class ShoppingList {

    ShoppingList(){}

    void saveNote(){

        try{
            FileWriter writer = new FileWriter("shopping.txt");
            writer.write("milk\n");
            writer.write("cheese\n");
            writer.close();
        } catch (IOException e) {
            System.out.println("Ошибка при сохранении и или создании текстового файла: " + e.getMessage());
        }

    } void readNote(){

        try{
            File reader = new File("shopping.txt");
            Scanner scanner = new Scanner(reader);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Ошибка при чтении файла: " + e.getMessage());
        }
    }

    static public void main(String[] args) {

        ShoppingList sh = new ShoppingList();
        sh.saveNote();
        sh.readNote();
    }
}