package insertionSort;

import static constants.MassConst.ARRAY;
import static insertionSort.InsertionSort.insertionSort;

public class StartTask {
    public static void start() {

        insertionSort(ARRAY);

        for (int num : ARRAY) {
            System.out.print(num + " ");
        }
    }
}