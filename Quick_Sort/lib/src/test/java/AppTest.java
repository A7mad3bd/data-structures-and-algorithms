import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class AppTest {
    @Test
    void quickSorttTest() {
        int[] arr = {6, 4, 7, 8, 1, 3};
        int[] arr1 = {1, 3, 4, 6, 7, 8};
        Quick_Sort.quickSort(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        for (int i = 0; i < arr.length; i++) {
            assertEquals(arr[i], arr1[i]);

        }
    }

    @Test
    void Reverse_sortedTest() {
        int[] arr = {20, 18, 12, 8, 5, -2};
        int[] arr1 = {-2, 5, 8, 12, 18, 20};
        Quick_Sort.quickSort(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            assertEquals(arr[i], arr1[i]);}}
    @Test
    void FewuniquesTest() {
        int[] arr = {2, 3, 5, 7, 13, 11};
        int[] arr1 = {2, 3, 5, 7, 11, 13};
        Quick_Sort.quickSort(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            assertEquals(arr[i], arr1[i]);}}
    @Test
    void Nearly_sortedTest() {
        int[] arr = {2, 3, 5, 7, 13, 11};
        int[] arr1 = {2, 3, 5, 7, 11, 13};
        Quick_Sort.quickSort(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            assertEquals(arr[i], arr1[i]);

        }
    }


}