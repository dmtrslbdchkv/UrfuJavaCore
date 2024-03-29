package lr3.task9;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int number = 2;
        List<Integer> arrayList = new ArrayList<>();
        SortedSet<Integer> sortedSet = new TreeSet<>();
        List<Integer> linkedList = new LinkedList<>();
        addElements(arrayList, number);
        addElements(sortedSet, number);
        addElements(linkedList, number);
        System.out.println("Время в нс");
        System.out.println("Время выполнения операции добавления в начало ArrayList = " + getRunningTimeOfAdd(arrayList, 0, 100));
        System.out.println("Время выполнения операции добавления в середину ArrayList = " + getRunningTimeOfAdd(arrayList, ((number * 1_000_000) / 2), 500));
        System.out.println("Время выполнения операции добавления в конец ArrayList = " + getRunningTimeOfAdd(arrayList, number * 1_000_000, 500));
        System.out.println("Время выполнения операции добавления в начало TreeSet = " + getRunningTimeOfAdd(sortedSet, 0));
        System.out.println("Время выполнения операции добавления в середину TreeSet = " + getRunningTimeOfAdd(sortedSet, ((number * 1_000_000) / 2)));
        System.out.println("Время выполнения операции добавления в конец TreeSet = " + getRunningTimeOfAdd(sortedSet, number * 1_000_000));
        System.out.println("Время выполнения операции добавления в начало  LinkedList = " + getRunningTimeOfAdd(linkedList, 0, 100));
        System.out.println("Время выполнения операции добавления в середину LinkedList = " + getRunningTimeOfAdd(linkedList, ((number * 1_000_000) / 2), 500));
        System.out.println("Время выполнения операции добавления в конец LinkedList = " + getRunningTimeOfAdd(linkedList, number * 1_000_000, 500));
        System.out.println("Время выполнения операции удаления в начале ArrayList = " + getRunningTimeOfRemove(arrayList, 0));
        System.out.println("Время выполнения операции удаления в середине ArrayList = " + getRunningTimeOfRemove(arrayList, ((number * 1_000_000) / 2)));
        System.out.println("Время выполнения операции удаления в конце ArrayList = " + getRunningTimeOfRemove(arrayList, number * 1_000_000));
        System.out.println("Время выполнения операции удаления в начале TreeSet = " + getRunningTimeOfRemove(sortedSet, 0));
        System.out.println("Время выполнения операции удаления в середине TreeSet = " + getRunningTimeOfRemove(sortedSet, ((number * 1_000_000) / 2)));
        System.out.println("Время выполнения операции удаления в конце TreeSet = " + getRunningTimeOfRemove(sortedSet, number * 1_000_000));
        System.out.println("Время выполнения операции удаления в начале LinkedList = " + getRunningTimeOfRemove(linkedList, 0));
        System.out.println("Время выполнения операции удаления в середине LinkedList = " + getRunningTimeOfRemove(linkedList, ((number * 1_000_000) / 2)));
        System.out.println("Время выполнения операции удаления в конце LinkedList = " + getRunningTimeOfRemove(linkedList, number * 1_000_000));
        System.out.println("Время выполнения операции взятия элемента ArrayList = " + getRunningTimeOfGet(arrayList, 267));
        System.out.println("Время выполнения операции взятия элемента TreeSet = " + getRunningTimeOfGet(sortedSet, 267));
        System.out.println("Время выполнения операции взятия LinkedList = " + getRunningTimeOfGet(linkedList, 267));
    }

    private static void addElements(List<Integer> list, int number) {
        for (int i = 0; i < 1_000_000 * number; i++) {
            list.add(i);
        }
    }

    private static void addElements(SortedSet<Integer> set, int number) {
        for (int i = 0; i < 1_000_000 * number; i++) {
            set.add(i);
        }
    }

    private static long getRunningTimeOfAdd(List<Integer> list, int index, int value) {
        long start = System.nanoTime();
        list.add(index, value);
        long end = System.nanoTime();
        return end - start;
    }

    private static long getRunningTimeOfAdd(SortedSet<Integer> set, int value) {
        long start = System.nanoTime();
        set.add(value);
        long end = System.nanoTime();
        return end - start;
    }

    private static long getRunningTimeOfRemove(List<Integer> list, int index) {
        long start = System.nanoTime();
        list.remove(index);
        long end = System.nanoTime();
        return end - start;
    }

    private static long getRunningTimeOfRemove(SortedSet<Integer> set, int number) {
        long start = System.nanoTime();
        set.remove(number);
        long end = System.nanoTime();
        return end - start;
    }

    private static long getRunningTimeOfGet(List<Integer> list, int index) {
        long start = System.nanoTime();
        int k = list.get(index);
        long end = System.nanoTime();
        return end - start;
    }

    private static long getRunningTimeOfGet(SortedSet<Integer> set, int number) {
        long start = System.nanoTime();
        int currentIndex = 0;
        for (int element : set) {
            if (currentIndex == number) {
                break;
            }
            currentIndex++;
        }
        long end = System.nanoTime();
        return end - start;
    }
}
