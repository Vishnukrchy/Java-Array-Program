package Array;

import java.util.Arrays;

public class RotateRight {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6};
        int k = 1; // Number of positions to rotate to the right
        rotateRight(a, k);

        // Print the modified array
        System.out.println(Arrays.toString(a));
    }

    private static void rotateRight(int[] a, int k) {
        int len = a.length;
      //  k = k % len; // In case k is larger than the array length

        // Reverse the entire array
        reverse(a, 0, len - 1);
        // Reverse the first k elements
        reverse(a, 0, k - 1);
        // Reverse the remaining elements
        reverse(a, k, len - 1);
    }

    private static void reverse(int[] a, int start, int end) {
        while (start < end) {
            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            start++;
            end--;
        }
    }
}
