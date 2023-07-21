import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class EpicTask extends Task {

    private List<Task> subTasks = new ArrayList<>();

    public EpicTask() {
    }

    public EpicTask(String name, String description, TaskStatus status) {
        super(name, description, status);
    }

    public List<Task> getSubTasks() {
        return subTasks;
    }

    public void setSubTasks(List<Task> subTasks) {
        this.subTasks = subTasks;
    }
}
