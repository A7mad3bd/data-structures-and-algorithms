package linked;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class AppTest {
    @Test
    void inserttest() {
        linked<String> list1 = new linked();
        list1.inseert("1");
        assertTrue(list1.head.value == "1" == true);
    }

    @Test
    void includestest() {
        linked<String> list1 = new linked();
        list1.inseert("2");
        list1.inseert("3");
        list1.inseert("4");
        assertTrue(list1.includes("3") == true);
    }

    @Test
    void toStringtest() {
        linked<String> list1 = new linked();
        list1.inseert("5");
        list1.inseert("4");
        list1.inseert("3");
        assertTrue(list1.toString().equals("{ 3 } -> { 4 } -> { 5 } -> NULL") == true);
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
        S2 = list1.head.next.next;
        String value = (String) S2.value;
        list1.insertBefore(S2, "3");
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
        S2 = list1.head.next;
        String value = (String) S2.value;
        list1.insertAfter(S2, "3");
        assertEquals("{ 1 } -> { 2 } -> { 3 } -> { 4 } -> NULL", list1.toString());
    }

    @Test
    void kthFromEnd_test() {
        linked<String> list1 = new linked();
        list1.inseert("A");
        list1.inseert("B");
        list1.inseert("C");
        list1.inseert("D");
        list1.inseert("E");

        String Test1 = list1.kthFromEnd(15);
        assertEquals("Index Not Exist",Test1);

        String Test2 = list1.kthFromEnd(list1.size()-1);
        assertEquals("E",Test2);

        String Test3 = list1.kthFromEnd(0);
        assertEquals("A",Test3);

        String Test4 = list1.kthFromEnd(-1);
        assertEquals("Index Not Exist",Test4);

        assertEquals("{ E } -> { D } -> { C } -> { B } -> { A } -> NULL", list1.toString());
    }

    @Test
    void zip_test() {
        linked<String> list1 = new linked();
        list1.inseert("B");
        list1.inseert("A");


        linked<String> list2 = new linked();
        list2.inseert("D");
        list2.inseert("C");

        linked<String> list3 = new linked();

       linked Test4 = list3.zip_list (list1,list2);


        assertEquals("{ A } -> { C } -> { B } -> { D } -> NULL", Test4.toString());
    }
    @Test
    void TestPalindrome() {
        linked<String> list1 = new linked();
        list1.inseert("A");
        list1.inseert("B");
        list1.inseert("D");
        list1.inseert("B");
        list1.inseert("A");

        linked<String> list2 = new linked();
        list2.inseert("D");
        list2.inseert("C");
        list2.inseert("F");
        list2.inseert("F");
        list2.inseert("D");


        assertTrue(list1.Palindrome());
        assertEquals(list2.Palindrome(),false);

    }
}


/*

* */
