package quickSort;

import static constants.MassConst.ARRAY;
import static quickSort.QuickSort.quickSort;

public class StartTask {
    public static void start() {
        quickSort(ARRAY, 0, ARRAY.length - 1);
        for (int num : ARRAY) {
            System.out.print(num + " ");
        }
    }
}