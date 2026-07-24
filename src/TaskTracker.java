import java.util.ArrayList;

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
}

public class TaskTracker {

    public static void main(String[] args) {

        TaskManager tm = new TaskManager();
        tm.addTask("Clean");
        tm.addTask("Drive");
        tm.addTask("Paint");

        tm.showTasks();
    }
}