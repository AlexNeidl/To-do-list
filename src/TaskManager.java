import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    private List<Task> aufgabenListe;

    public TaskManager() {
        aufgabenListe = new ArrayList<>();
    }

    public void addTask(Task task) {
        aufgabenListe.add(task);
    }

    public void editTask(int index, Task task) {
        if (index >= 0 && index < aufgabenListe.size()) {
            aufgabenListe.set(index, task);
        }
    }

    public void deleteTask(int index, Task task) {
        if (index >= 0 && index < aufgabenListe.size()) {
            aufgabenListe.remove(index);
        }

    }

    public List<Task> getAufgabenListe() {
        return aufgabenListe;
    }
}
