import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class AppTest {
    @Test
    void MergeSortTest() {
        int[] arr = {6, 4, 7, 8, 1, 3};
        int[] arr1 = {1, 3, 4, 6, 7, 8};

        Merge_Sort.mergeSort(arr);

        for (int i = 0; i < arr.length; i++) {
            assertEquals(arr[i], arr1[i]);

        }
    }

}