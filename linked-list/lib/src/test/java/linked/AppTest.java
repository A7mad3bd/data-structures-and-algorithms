package linked;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class AppTest {
    @Test
    void inserttest() {
        linked<String> list1 = new linked();
        list1.inseert("1");
        assertTrue(list1.head.value=="1"==true);
    }
    @Test
    void includestest() {
        linked<String> list1 = new linked();
        list1.inseert("2");
        list1.inseert("3");
        list1.inseert("4");
            assertTrue(list1.includes("3")==true);
    }

    @Test
    void toStringtest() {
        linked<String> list1 = new linked();
        list1.inseert("5");
        list1.inseert("4");
        list1.inseert("3");
        assertTrue(list1.toString().equals("{ 3 } -> { 4 } -> { 5 } -> NULL")==true);
    }

    @Test
    void appendtest() {
        Node s1;
        linked<String> list1 = new linked();
        list1.inseert("1");
        list1.inseert("2");
        list1.append("3");
        assertEquals("{ 2 } -> { 1 } -> { 3 } -> NULL", list1.toString());
    }

    @Test
    void insertBeforetest() {
        linked<String> list1 = new linked();
        list1.inseert("4");
        list1.inseert("2");
        list1.inseert("1");
        Node S2;
        S2=  list1.head.next.next;
        String value= (String) S2.value;
        list1.insertBefore(S2,"3");
        assertEquals("{ 1 } -> { 2 } -> { 3 } -> { 4 } -> NULL", list1.toString());
    }

    @Test
    void insertAftertest() {
        linked<String> list1 = new linked();
        list1.inseert("4");
        list1.inseert("2");
        list1.inseert("1");
        System.out.println(list1.toString());
        Node S2;
        S2=  list1.head.next;
        String value= (String) S2.value;
        list1.insertAfter(S2,"3");
        assertEquals("{ 1 } -> { 2 } -> { 3 } -> { 4 } -> NULL", list1.toString());
    }


}
