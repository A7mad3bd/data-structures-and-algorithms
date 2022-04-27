/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package InsertionSort;

import org.junit.jupiter.api.Test;


import static InsertionSort.Library.sort;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


class LibraryTest {
    @Test
    void someLibraryMethodReturnsTrue() {
        Library classUnderTest = new Library();
        assertTrue(classUnderTest.someLibraryMethod(), "someLibraryMethod should return 'true'");
    }
    @Test void insertionSort()
    {
        int[] arr1= new int[]{20, 1, 12, 8, 5, -2};
        int[] arr2= new int[]{20,  12, 8, 5,1, -2};

        sort(arr1);
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
        System.out.println();
        assertEquals(arr1,arr2);
    }
}
