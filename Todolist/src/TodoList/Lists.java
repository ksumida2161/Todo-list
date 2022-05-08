package TodoList;
import java.util.ArrayList;
import java.util.Scanner;

public abstract class Lists {
    Scanner in = new Scanner(System.in);
    ArrayList<Todo> todo;

    public Lists() {
        todo = new ArrayList<>();
    }

    //REQUIRES: todolists to exists
    //MODIFIES: this
    //Effects:  add new element to the list
    public void addTodo(){
        todo.add(new Todo());
    }

    //REQUIRES: todosize()>0
    //MODIFIES: this
    //EFFECTS:  Remove selected todoObject from the array
    public void removeTodo(){
       todo.remove(new Todo());
    }

    //REQUIRES: list to exist
    //EFFECTS:  prints the list
    public void printList(){
        for(int i = 0; i < todo.size(); i++)
        System.out.println(todo.get(i).toString());
    }
}
