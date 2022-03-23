package com.pkg;
import com.pkg.AnimalShelter.AnimalShelter;
import org.junit.jupiter.api.Test;

public class AnimalShelterTest {

    @Test
    void testEnqueue() throws Exception {
        AnimalShelter one = new AnimalShelter();
        one.enqueue("cat");
        one.enqueue("dog");
        one.enqueue("sdccd");
        System.out.println(one);
    }

    @Test
    void testDequeues() throws Exception {
        AnimalShelter two = new AnimalShelter();
        two.enqueue("cat");
        two.dequeue("cat");
        System.out.println(two);

    }


}
