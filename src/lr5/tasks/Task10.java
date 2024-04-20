package lr5.tasks;

import java.util.List;
import java.util.stream.Collectors;

public class Task10 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(10, 20, 5, 15, 25);
        System.out.println("Список до: " + numbers);
        int threshold = 15;
        List<Integer> filteredNumbers = filterNumbers(numbers, threshold);
        System.out.println("Список после: " + filteredNumbers);
    }

    public static List<Integer> filterNumbers(List<Integer> numbers, int threshold) {
        return numbers.stream()
                .filter(num -> num < threshold)
                .collect(Collectors.toList());
    }
}
