package bubbleSortAndBinarySearch;

import utils.PrintUtil;

import static constants.MassConst.ARRAY;

public class StartTask {
    public static void start() {

        System.out.println("Неотсортированный массив:");
        PrintUtil.printArray(ARRAY);

        BubbleSort.myBubbleSort(ARRAY);

        System.out.println("Отсортированный массив:");
        PrintUtil.printArray(ARRAY);

        int target = 23;
        int result = BinarySearchAfterSort.binarySearch(ARRAY, target, 0);

        if (result == -1) {
            System.out.println("Элемент " + target + " отсутствует в списке");
        } else {
            System.out.println("Число " + target + " является " + (result + 1) + " элементом в списке");
        }
    }

}