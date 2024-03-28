package lr3.task5;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(0, "Ноль");
        map.put(1, "Один");
        map.put(2, "Два");
        map.put(3, "Три");
        map.put(4, "Четыре");
        map.put(5, "Пять");
        map.put(6, "Шесть");
        map.put(7, "Семь");
        map.put(8, "Восемь");
        map.put(9, "Девять");
        map.put(10, "Десять");

        String result = "";
        int product = 1;

        for (Integer key : map.keySet()) {
            if (key > 5) {
                System.out.println(map.get(key));
            } else if (key == 0) {
                result = String.join(", ", map.values());
            }

            if (map.get(key).length() > 5) {
                product *= key;
            }
        }

        System.out.println("Результат: " + result);
        System.out.println("Произведение ключей с длиной строки больше 5: " + product);
    }
}
