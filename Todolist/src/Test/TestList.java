package Test;
import TodoList.*;

import java.util.Scanner;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestList {
    Scanner in = new Scanner(System.in);
//    ArrayList<Todo> test;
    NormalList test;
    @BeforeEach
    public void testList(){
        System.out.println("print");
        test = new NormalList();
    }

    @Test
    public void testAddSingleTodo(){
        //test.addSingleTodo("s", "d");
        NormalList test2=new NormalList();
        assertEquals(1, test2.addSingleTodo("s","d"),"OK");
    }

    @Test
    public void testRemoveTodo(){
        for(int i = 1; i <= 3; i++) {
        //    test.addSingleTodo();
        }
        test.removeTodo();
        //assertEquals(2, test.getTodo().size());
    }


//    @BeforeEach
//    public void testList(){
//        test = new ArrayList<Todo>();
//        for(int i = 1; i <= 5; i++){
//            test.add(new Todo());
//        }
//    }
//
//    @Test
//    public void testAddSingleTodo(){
//        assertEquals(5, test.size());
//        test.add(new Todo());
//        assertEquals(6, test.size());
//    }
//
//    @Test
//    public void testEditTodo(){
//        test.get(0).setToDoTitle("testTitle");
//        test.get(0).setDescription("testDescription");
//
//        assertEquals("testTitle", test.get(0).getToDoTitle());
//        assertEquals("testDescription", test.get(0).getDescription());
//    }
//
//    @Test
//    public void testRemoveTodo(){
//        test.add(new Todo());
//        test.remove(0);
//
//        assertEquals(4, test.size());
//
//    }

}
