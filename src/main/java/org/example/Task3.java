package org.example;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Task3 {

    private static final int ELEMENT_COUNT = 1_000_000;
    private static final int ACCESS_COUNT = 1_000_000;

    public static void main(String[] args) {

        List<Integer> arrayList = new ArrayList<>();
        long arrayListAddTime = measureAddPerformance(arrayList);
        long arrayListAccessTime = measureAccessPerformance(arrayList);


        List<Integer> linkedList = new LinkedList<>();
        long linkedListAddTime = measureAddPerformance(linkedList);
        long linkedListAccessTime = measureAccessPerformance(linkedList);

        
        System.out.println("ArrayList Add Time: " + arrayListAddTime + " ms");
        System.out.println("ArrayList Access Time: " + arrayListAccessTime + " ms");
        System.out.println("LinkedList Add Time: " + linkedListAddTime + " ms");
        System.out.println("LinkedList Access Time: " + linkedListAccessTime + " ms");
    }

    private static long measureAddPerformance(List<Integer> list) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < ELEMENT_COUNT; i++) {
            list.add(i);
        }
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }

    private static long measureAccessPerformance(List<Integer> list) {
        Random random = new Random();
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < ACCESS_COUNT; i++) {
            int index = random.nextInt(ELEMENT_COUNT);
            list.get(index);
        }
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }
}
