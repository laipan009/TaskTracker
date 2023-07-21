import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {

        Manager manager = new Manager();
        manager.addNewTask(new SubTask());
        manager.addNewTask(new EpicTask());

        System.out.println(manager.getTasksList());



    }
}