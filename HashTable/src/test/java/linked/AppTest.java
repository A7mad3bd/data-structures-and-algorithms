package test.java.linked;

import com.example.Tree_intersection.BinaryTreeSearch;
import com.example.Tree_intersection.Node;
import com.example.structure.HashTable;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class AppTest {
    HashTable<String, String> HM = new HashTable<>();

    @Test
    void Tests() {
        //put
        HM.put("JAVA", "JAVA");
        HM.put("Amman", "Amman");
        HM.put("Jordan", "Jordan");
        HM.put("J", "J");
        HM.put("Bob", "Bob");
        HM.put("Carl", "Carl");
        HM.put("new", "cd");

        //getSize
        assertEquals(7, HM.getSize());
        //contains
        assertTrue(HM.contains("Bob"));

        //get
        assertEquals("Jordan", HM.get("Jordan"));
        assertEquals("cd", HM.get("new"));

        //isEmpty
        HashTable<Integer, String> empty = new HashTable<>();
        assertTrue(empty.isEmpty());
    }

    @Test
    public void repeatedWordTest() {

        HashTable<String, Integer> test = new HashTable<String, Integer>();

        String paragraph1 = "Once upon a time, there was a brave princess who...";
        assertEquals("a", test.repeatedWord(paragraph1));

        String paragraph2 = "It was the best of times, it was the worst of times, it was the age of wisdom, it was the age of foolishness, it was the epoch of belief, it was the epoch of incredulity, it was the season of Light, it was the season of Darkness, it was the spring of hope, it was the winter of despair, we had everything before us, we had nothing before us, we were all going direct to Heaven, we were all going direct the other way – in short, the period was so far like the present period, that some of its noisiest authorities insisted on its being received, for good or for evil, in the superlative degree of comparison only";
        assertEquals("it", test.repeatedWord(paragraph2));

        String paragraph3 = "It was a queer,  sultry summer, the summer they electrocuted the Rosenbergs, and I didn’t know what I was doing in New York";
        assertEquals("summer", test.repeatedWord(paragraph3));

    }


    @Test
    public void tree_intersection_test() {

        HashTable<Integer, Integer> trees = new HashTable<Integer, Integer>();

        BinaryTreeSearch tree1 = new BinaryTreeSearch();
        BinaryTreeSearch tree2 = new BinaryTreeSearch();

        tree1.setRoot(new Node(1));
        tree1.getRoot().setLeft(new Node(2));
        tree1.getRoot().setRight(new Node(3));
        tree1.getRoot().getRight().setLeft(new Node(4));
        tree1.getRoot().getRight().setRight(new Node(5));


        tree2.setRoot(new Node(1));
        tree2.getRoot().setLeft(new Node(3));
        tree2.getRoot().setRight(new Node(5));
        tree2.getRoot().getRight().setLeft(new Node(7));
        tree2.getRoot().getRight().setRight(new Node(9));
        ArrayList<String> arr = new ArrayList<>();
        arr.add("3");
        arr.add("1");
        arr.add("5");

        assertEquals(HashTable.tree_intersection(tree1, tree2),arr);


    }




}
