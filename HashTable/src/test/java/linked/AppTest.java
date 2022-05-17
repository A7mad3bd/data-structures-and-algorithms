package test.java.linked;

import com.example.structure.HashMap;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class AppTest {
    HashMap<String, String> HM = new HashMap<>();

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
        HashMap<Integer, String> empty = new HashMap<>();
        assertTrue(empty.isEmpty());
    }



}
