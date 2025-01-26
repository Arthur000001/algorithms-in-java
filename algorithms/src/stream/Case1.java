package stream;

import stream.model.Employee;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static stream.StartTask.EMPLOYEES;

public class Case1 {

    /** Фильтрация сотрудников:
     *     Вывести всех сотрудников старше 30 лет.
     *     Вывести всех сотрудников, чья зарплата больше 50000 и они работают в департаменте "IT".
     * */
    public static List<Employee> filteringEmployee() {
        return EMPLOYEES.stream()
            .filter(el -> el.getAge() > 30)
            .filter(el -> el.getSalary() > 50000)
            .collect(Collectors.toList());
    }

    /** Сортировка сотрудников:
     *     Отсортировать сотрудников по возрасту.
     *     Отсортировать сотрудников по департаменту, а затем по зарплате (в пределах департамента).
     * */
    public static List<Employee> sortingEmployee() {
        return EMPLOYEES.stream()
            .sorted(Comparator.comparing(Employee::getAge))
            .collect(Collectors.toList());
    }

    /** Агрегирование данных:
    *     Найти среднего возраста сотрудников в департаменте "HR".
    *     Подсчитать общее количество сотрудников в департаменте "Finance".
    */
    public static double aggregationData() {
        return EMPLOYEES.stream()
            .filter(el -> el.getDepartment() == "HR")
            .mapToInt(el -> el.getAge())
            .average()
            .orElse(0);
    }

    /** Сбор данных в коллекции:
     *     Создать список сотрудников, работающих в департаменте "IT", и отсортировать их по зарплате.
     */
    public static List<Employee> collectingDataIntoCollections() {
        return EMPLOYEES.stream()
            .filter(el -> el.getDepartment() == "IT")
            .sorted(Comparator.comparing(Employee::getSalary))
            .collect(Collectors.toList());
    }

    /** Группировка данных:
     *     Сгруппировать сотрудников по департаментам и посчитать количество сотрудников в каждом департаменте.
     */
    public static Map<String, Long> groupingData() {
        return EMPLOYEES.stream()
            .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
    }

    /** Поиск сотрудника:
     *     Найти любого сотрудника с зарплатой более 80000.
     */
    public static Employee searchEmployee() {
        return EMPLOYEES.stream()
            .filter(el -> el.getSalary() > 80000)
            .findAny()
            .get();
    }
}