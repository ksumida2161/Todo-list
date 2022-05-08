package TodoList;

import java.util.Date;

public class Todo {
    public static int numToDo;
    private java.util.Date date;
    private String toDoTitle, Description;

    //Constructor
    public Todo(){
        this("No information", "No Description");
    }

    public Todo(String toDoTitle, String Description){
        setToDoTitle(toDoTitle);
        setDescription(Description);
        date = new Date();
        ++numToDo;
    }

    //EFFECTS: Returns the details of the object by string
    public String toString(){
        return getToDoTitle() + "\n   Number of ToDo: " + numToDo + "\n   Date: " + getDate() + "\n   Description: " + getDescription();
    }


    //Getter and Setter
    public Date getDate() {
        return date;
    }

    public String getToDoTitle() {
        return toDoTitle;
    }

    public void setToDoTitle(String toDoTitle) {
        this.toDoTitle = toDoTitle;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }
}

