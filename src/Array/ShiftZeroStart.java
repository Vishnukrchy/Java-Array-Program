package Array;

public class ShiftZeroStart {
    public static void main(String[] args) {
        int a[] = { 25, 0, 12, 0, 3 };
        sift(a);

        // Print the modified array
        for (int i : a) {
            System.out.print(i + " ");
        }
    }

    private static void sift(int[] a) {
        int n = a.length;
        int count = n - 1; // Position to place non-zero elements from the end

        // Traverse the array from the end and place non-zero elements at 'count'
        for (int i = n - 1; i >= 0; i--) {
            if (a[i] != 0) {
                a[count--] = a[i];
            }
        }

        // Fill the remaining positions from the start with zeroes
        while (count >= 0) {
            a[count--] = 0;
        }
    }
}
