import java.io.FileWriter;
import java.io.IOException;
import java.io.File;
import java.util.Scanner;

public class FileDemo {

    public static void main(String[] args) {

        // Запись в файл
        try {
            FileWriter writer = new FileWriter("my_notes.txt");
            writer.write("Привет\n");
            writer.write("Привет привет\n");
            writer.write("Привет привет привет\n");
            writer.close();
        } catch (IOException e) {
            System.out.println("Ошибка записи: " + e.getMessage());
        }

        // Чтение из файла
        try {
            File file = new File("my_notes.txt");
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }

            scanner.close();
        } catch (IOException e) {
            System.out.println("Ошибка чтения: " + e.getMessage());
        }
    }
}