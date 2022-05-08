package ui;
import TodoList.NormalList;
import java.util.Scanner;

public class MainToDo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        NormalList l1 = new NormalList();
        l1.setListName("Test");

        System.out.print("what would you like to do? \n[1] add a to do list item, \n[2] edit the todo \n[3] cross off an item, \n[4] show all the items, \n[0] exit");
        int x = in.nextInt();

        while (x != 0) {
            switch (x) {
                case 1:
                    l1.addTodo();
                    break;

                case 2:
                    l1.editToDo();
                    break;

                case 3:
                    l1.removeTodo();
                    break;

                case 4:
                    l1.printList();
                    break;

                default:
                    System.out.println("Invalid input");
                    break;
            }
            System.out.println("what would you like to do? \n[1] add a to do list item, \n[2] edit the todo \n[3] cross off an item, \n[4] show all the items, \n[0] exit");
            x = in.nextInt();
        }
    }
}

