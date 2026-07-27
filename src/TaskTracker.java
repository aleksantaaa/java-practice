import java.util.ArrayList;
import java.io.FileWriter;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

class Task {

    String name;
    boolean done;


    Task (String name){

        this.name = name;
        this.done = false;
    }
}



class TaskManager {

    ArrayList<Task> tasks = new ArrayList<>();


    TaskManager() {}

    void addTask(String name) {
        Task newTask = new Task(name);
        tasks.add(newTask);
    }

    void showTasks() {

        for ( int i = 0; i < tasks.size(); i++) {
            System.out.println(tasks.get(i).name);
        }
        System.out.println();
    }

    void markAsDone( int index ) {
        tasks.get(index).done = true;
    }

    void saveToFile(String filename) {

        try {

            FileWriter writer = new FileWriter(filename);
            for ( int i = 0; i < tasks.size(); i++) {
                writer.write(tasks.get(i).name + "\n");
            }
            writer.close();

        }

        catch (IOException e) {
            System.out.println("There is a fault occured while reading the file");
        }
    }

    void loadFromFile(String filename) {

        try {
            File file = new File(filename);
            Scanner reader = new Scanner (file);

            while ( reader.hasNextLine()) {

                String taskName = reader.nextLine();
                Task newTask = new Task(taskName);
                tasks.add(newTask);
            }
        } catch (IOException e) {

            System.out.println("There is a failure with loading tasks");
        }
    }
}


public class TaskTracker  {

    public static void main(String[] args) {

        TaskManager tm = new TaskManager();
        tm.addTask("Clean");
        tm.addTask("Drive");
        tm.addTask("Paint");

        tm.showTasks();

        tm.saveToFile("tasks.txt");
        tm.loadFromFile("tasks.txt");

        tm.showTasks();

    }
}
