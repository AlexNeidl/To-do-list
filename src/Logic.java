import java.util.Scanner;

public class Logic {
    TaskManager taskManager = new TaskManager();
    Scanner scanner = new Scanner(System.in);
    String command;

    public void logic() {

        do {
            System.out.println("Befehle: add, edit, delete, list, complete, exit");
            command = scanner.nextLine();

            switch (command) {
                case "add":
                    System.out.println("Titel: ");
                    String title = scanner.nextLine();
                    System.out.println("Beschreibung: ");
                    String description = scanner.nextLine();
                    taskManager.addTask(new Task(title, description));
                    break;

                case "edit":
                    System.out.println("Geben Sie den Index der Aufgabe ein, die Sie bearbeiten möchten: ");
                    int editIndex = Integer.parseInt(scanner.nextLine()) - 1;
                    System.out.println("Neuer Titel: ");
                    String newTitle = scanner.nextLine();
                    System.out.println("Neue Beschreibung: ");
                    String newDescription = scanner.nextLine();
                    taskManager.editTask(editIndex, new Task(newTitle, newDescription));
                    break;

                case "delete":
                    System.out.println("Geben Sie den Index der Aufgabe ein, die Sie löschen möchten: ");
                    int deleteIndex = Integer.parseInt(scanner.nextLine()) - 1;
                    taskManager.deleteTask(deleteIndex);
                    break;

                case "complete":
                    System.out.println("Geben sie den Index der Aufgabe ein, die sie als erledigt markieren möchten:");
                    int completeIndex = Integer.parseInt(scanner.nextLine()) - 1;
                    if (completeIndex >= 0 && completeIndex < taskManager.getTaskslist().size()) {
                        taskManager.getTaskslist().get(completeIndex).markAsCompleted();
                        System.out.println("Aufgabe als erledigt markiert");
                    } else {
                        System.out.println("Ungültiger Index, Bitte versuchen sie es erneut.");
                    }
                    break;


                case "list":
                    int index = 1;
                    for (Task task : taskManager.getTaskslist()) {
                        System.out.println(index + ": " + task);
                        index++;


                    }
                    break;

            }
        } while (!command.equals("exit"));

        scanner.close();
    }
}
