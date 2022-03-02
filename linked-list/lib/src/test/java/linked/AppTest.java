package linked;

import org.junit.jupiter.api.Test;

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
}
