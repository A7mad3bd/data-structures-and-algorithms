


public class Main {

    public static void main(String[] args) {
        int arr[] = {-4, -1, 0, 3, 10};
        int arr1[]=squreandsort(arr);
        System.out.println(arr1);

    }

            /*
Input: nums = [-4,-1,0,3,10]
Output: [0,1,9,16,100]
Explanation: After squaring, the array becomes [16,1,0,9,100].
After sorting, it becomes [0,1,9,16,100].

            * */

    public static int[] squreandsort(int[] arr) {
        int arr1[] = arr;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * arr[i];
        }

        return arr1;
    }
}

