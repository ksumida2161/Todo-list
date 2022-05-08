package TodoList;
import java.util.ArrayList;
import java.util.Scanner;

public class NormalList extends Lists{
    private String ListName;
    Scanner in = new Scanner(System.in);
    ArrayList<Todo> todo;

    public NormalList() {
        super();
    }

    //EFFECTS:  Call addSingleTodo() if user inputs 0, Call addMultipleTodo() if user inputs 1
    public void addTodo() {
        System.out.println("Add single or multiple todo? [0] Single, [1] Multiple");
        int x = in.nextInt();
        if (x == 0) {
       //     addSingleTodo();
        } else {
            if (x == 1) {
                addMultipleTodo();
            }
            }
    }


    //MODIFIES: This
    //EFFECTS:  Add single todoObject into the todolist. if user selects 0, ask user for inputs and call 2 arg constructor,
    //          else call no-arg constructor
    public int addSingleTodo(String s, String d) {
        System.out.println("Do you want to edit now? \n[0] Yes, [1] No");

        String input = "0";

        if(input.equals("0")){
            System.out.println("What is your title?");
            String title = s;
                    //in.next();

            System.out.println("What is your description?");
            in.nextLine();
            String description = d;
            todo.add(new Todo(title, description));
            System.out.println("Todo with title and description is made.");
            System.out.println();

        } else{
            todo.add(new Todo());
            System.out.println("Todo without title and description is made.");
            System.out.println();
        }
        return d.length();
    }

    //EFFECTS: the loop of If the user inputs Y, call addSingleTodo() until the user inputs other than Y
    public void addMultipleTodo(){

        System.out.println("Enter Y to add 1 more todo. N to stop");
        String input = in.next().toUpperCase();
        while(input.equals("Y")) {
           // addSingleTodo();
            System.out.println("Add more todo? (Y/N)");
            input = in.next().toUpperCase();
        }
    }

    //REQUIRES: todoArraylist exist, and there is todoObject inside
    //MODIFIES: this
    //EFFECTS:  Call the setter method from the todoClass
    public void editToDo(){
        System.out.println("Edit which one?");
        int x = in.nextInt();
        System.out.println("What do you want to edit? \n[1] title, [2] Description, [3] Both, [4] exit");
        int y = in.nextInt();

        switch(y){
            case 1:
                System.out.println("Enter your new title: ");
                String title = in.nextLine();
                todo.get(x).setToDoTitle(title);
                break;

            case 2:
                System.out.println("Enter your new Description: ");
                String description = in.nextLine();
                todo.get(x).setDescription(description);
                break;

            case 3:
                System.out.println("Enter your new title: ");
                title = in.nextLine();
                todo.get(x).setToDoTitle(title);
                System.out.println("Enter your new Description: ");
                description = in.nextLine();
                todo.get(x).setDescription(description);
                break;

            default:
                System.out.println("Edit command finished");
                break;
        }
    }

    //MODIFIES: this
    //EFFECTS:  Remove selected todoObject from the array
    public void removeTodo(){
        String input = "";
        do {
            if(todo.size() == 0){
                System.out.println("You have nothing to cross out.");
            }else {
                System.out.println("Enter which ToDo to cross out: ");
                int x = in.nextInt();
                if(x >= 0 && x < todo.size()) {
                    todo.remove(x);
                } else {
                    System.out.println("Invalid input");
                }
                System.out.println("Cross out again? (Y/N)");
                input = in.next();
                }
        } while(input.equals("Y"));
    }


    //EFFECTS: Print the information of the list
    public void printList(){
        System.out.println("List: " + getListName());
        System.out.println("----------------------------------------");
        for(int i = 0; i < todo.size(); i++){
            System.out.println(getTodo().get(i).toString());
        }
    }

    public String getListName() {
        return ListName;
    }

    public void setListName(String listName) {
        ListName = listName;
    }

    public ArrayList<Todo> getTodo() {
        return todo;
    }

    public void setTodo(ArrayList<Todo> todo) {
        this.todo = todo;
    }
}
