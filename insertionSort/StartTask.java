package insertionSort;

import static insertionSort.InsertionSort.insertionSort;
import static constants.MassConst.ARRAY;

public class StartTask {
    public static void start() {

        insertionSort(ARRAY);

        for (int num : ARRAY) {
            System.out.print(num + " ");
        }
    }
}