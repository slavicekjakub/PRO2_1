package cz.uhk.fim.todolist.model;



public class TodoItem {
    private String title;
    private boolean complete;
    private String dateTime;

    public TodoItem() {
    }

    public TodoItem(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isComplete() {
        return complete;
    }

    public void setComplete(boolean complete) {
        this.complete = complete;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
        //TODO: pouzit toto k dodelani casu
    }
}
