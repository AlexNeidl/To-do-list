
//Diese Klasse repräsentiert eine einzelne Aufgabe

public class Task {

    private String title;
    private String description;
    private Boolean isCompleted;

    public Task (String title, String description){
        this.title = title;
        this.description = description;
        this.isCompleted = false;
    }
    public void markAsCompleted(){
        this.isCompleted = true;
    }
    @Override
    public String toString(){
        return title + " - " + description + " - " + (isCompleted ?  "Erledigt" : "Nicht erledigt");
    }
}
