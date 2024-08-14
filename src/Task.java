
//Diese Klasse repräsentiert eine einzelne Aufgabe

public class Task {

    private String title;
    private String descripion;
    private Boolean isCompleted;

    public Task (String title, String descripion){
        this.title = title;
        this.descripion = descripion;
        this.isCompleted = false;
    }
    public void markAsCompleted(){
        this.isCompleted = true;
    }
    @Override
    public String toString(){
        return title + " - " + (isCompleted ?  "Erledigt" : "Nicht erledigt");
    }
}
