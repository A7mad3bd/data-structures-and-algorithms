import com.pkg.pseudoqueue;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class PsuedoQueueTest {

    @Test
    void testEnqueue() throws Exception {
        pseudoqueue test = new pseudoqueue();
        test.enqueue("A");
        assertEquals("A",test);
    }



    @Test
    void testEnqueues() throws Exception {
        pseudoqueue test = new pseudoqueue();
        test.enqueue("A");
        test.enqueue("B");
        test.enqueue("C");
        assertEquals("A",test);
    }

    @Test
    void testPsuedoQueueEnqueueFIFO() throws Exception {
        pseudoqueue test  = new pseudoqueue();
        //sut.enqueue(1);
        test.enqueue("A");
        test.enqueue("B");
        test.enqueue("C");
        System.out.println(test.Secound.peek());
        //assert(test.Secound.peek() == 3);
    }

    @Test
    void testPsuedoQueueDequeue() throws Exception {
        pseudoqueue test  = new pseudoqueue();
        //sut.enqueue(1);
        test.enqueue("A");
        test.enqueue("B");
        test.enqueue("C");
        test.dequeue();
       /// assert(test.Secound.peek() == 2);
    }

    @Test
    void testPsuedoQueueMultipleDequeue() throws Exception {
        pseudoqueue test  = new pseudoqueue();
        //sut.enqueue(1);
        test.enqueue("A");
        test.enqueue("B");
        test.enqueue("C");
        test.dequeue();
        test.dequeue();
       // assert(test.Secound.peek() == 1);
    }

    @Test
    void testPsuedoQueueDequeueEmptyStack() throws Exception {
        pseudoqueue sut  = new pseudoqueue();
        assertThrows(Exception.class, sut::dequeue);
    }

    }


