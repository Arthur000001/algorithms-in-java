package stream;

import stream.model.Employee;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static stream.Case1.aggregationData;
import static stream.Case1.collectingDataIntoCollections;
import static stream.Case1.filteringEmployee;
import static stream.Case1.groupingData;
import static stream.Case1.searchEmployee;
import static stream.Case1.sortingEmployee;

public class StartTask {

    public static final List<Employee> EMPLOYEES = Arrays.asList(
        new Employee("John", 28, "IT", 60000),
        new Employee("Alice", 34, "HR", 75000),
        new Employee("Bob", 45, "Finance", 90000),
        new Employee("Charlie", 32, "IT", 120000),
        new Employee("Diana", 29, "Finance", 50000),
        new Employee("Eve", 31, "IT", 70000),
        new Employee("Frank", 26, "HR", 45000)
    );

    public static void start() {
        startCase1();
    }

    public static void startCase1() {
        printArray(filteringEmployee(), "filteringEmployee");
        printArray(sortingEmployee(), "sortingEmployee");
        printNumber(aggregationData(), "aggregationData");
        printArray(collectingDataIntoCollections(), "collectingDataIntoCollections");
        printMap(groupingData(), "groupingData");
        printEmployee(searchEmployee(), "searchEmployee");
    }

    public static void printArray(List<Employee> elements, String nameMethod) {
        System.out.println("> All elements from " + nameMethod + ":");
        if (elements == null || elements.isEmpty()) {
            System.out.println("Collection empty");
        } else {
            elements.forEach(el -> System.out.println(el.toString()));
        }
        System.out.println();
    }

    public static void printNumber(double number, String nameMethod) {
        System.out.println("> Number from " + nameMethod + ": ");
        System.out.println(number);
        System.out.println();
    }

    public static void printMap(Map<String, Long> map, String nameMethod) {
        System.out.println("> Number from " + nameMethod + ": ");
        System.out.println(map);
        System.out.println();
    }

    public static void printEmployee(Employee employee, String nameMethod) {
        System.out.println("> Employee from " + nameMethod + ": ");
        System.out.println(employee);
        System.out.println();
    }
}