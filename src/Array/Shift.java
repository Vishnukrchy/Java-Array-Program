package Array;

import java.util.ArrayList;
import java.util.List;

public class Shift {
    public static void main(String[] args) {
        int[] a = {2, 0, 0, 0, 2, 1, 1, 0, 2, 1};
        List<Integer> result = shift(a);
        System.out.println(result);
    }

    public static List<Integer> shift(int[] a) {
        List<Integer> l = new ArrayList<>();

        int count0 = 0;
        int count1 = 0;
        int count2 = 0;

     
        for (int value : a) {
            if (value == 0) {
                count0++;
            } else if (value == 1) {
                count1++;
            } else {
                count2++;
            }
        }

       
        for (int i = 0; i < count0; i++) {
            l.add(0);
        }
        for (int i = 0; i < count1; i++) {
            l.add(1);
        }
        for (int i = 0; i < count2; i++) {
            l.add(2);
        }

        return l;
    }
}
