import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    private List<Task> taskslist;

    public TaskManager() {
        taskslist = new ArrayList<>();
    }

    public void addTask(Task task) {
        taskslist.add(task);
    }

    public void editTask(int index, Task task) {
        if (index >= 0 && index < taskslist.size()) {
            taskslist.set(index, task);
        }
    }

    public void deleteTask(int index) {
        if (index >= 0 && index < taskslist.size()) {
            taskslist.remove(index);
        }

    }

    public List<Task> getTaskslist() {
        return taskslist;
    }
}
