package lr5;

import java.util.List;
import java.util.stream.Collectors;

public class Task6 {
    public static void main(String[] args) {
        List<Integer> inputList = List.of(10, 20, 30, 40, 50);
        System.out.println("Список до: " + inputList);
        List<Integer> filteredList = filterDivisibleNumbers(inputList, 3);
        System.out.println("Список после: " + filteredList);
    }

    public static List<Integer> filterDivisibleNumbers(List<Integer> list, int divisor) {
        return list.stream()
                .filter(num -> num % divisor == 0)
                .collect(Collectors.toList());
    }
}
