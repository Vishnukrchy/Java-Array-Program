package Array;
// shift All zeros in in last
public class ShiftZeroinLast {
    public static void main(String[] args) {
        int a[] = { 25, 0, 12, 0, 3 };
        sift(a);

        // Print the modified array
        for (int i : a) {
            System.out.print(i + " ");
        }
    }

    private static void sift(int[] a) {
        int count = 0; // Count of non-zero elements

        // Traverse the array. If the element is non-zero, then
        // replace the element at index 'count' with this element
        for (int i = 0; i < a.length; i++) {
            if (a[i] != 0) {
                a[count++] = a[i]; // here count is incremented
            }
        }

        // Now all non-zero elements have been shifted to
        // front and 'count' is set as index of first 0.
        // Make all elements 0 from count to end.
        while (count < a.length) {
            a[count++] = 0;
        }
    }
}
