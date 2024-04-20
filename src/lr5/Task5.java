package lr5;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Task5 {
    public static void main(String[] args) {
        List<String> inputList = new ArrayList<>();
        inputList.add("apple");
        inputList.add("banana");
        inputList.add("orange");
        inputList.add("grape");
        List<String> filteredList = filterStrings(inputList, "an");
        System.out.println("Filtered list: " + filteredList);
    }

    public static List<String> filterStrings(List<String> list, String substring) {
        return list.stream()
                .filter(str -> str.contains(substring))
                .collect(Collectors.toList());
    }
}
