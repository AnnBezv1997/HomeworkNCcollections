package ru.ncedu.java.task.collections.part1.part2;

import java.util.LinkedHashMap;

public class SpeedLinkedHashMap {
    public static void linkedHashMap(){
        int size = 100000;
        LinkedHashMap linkedHashMap = new LinkedHashMap<>();

        long startAdd = System.nanoTime();
        for (int i = 0; i< size/2;i++){
            linkedHashMap.put(i,"Hash"+i);
        }
        long timeAdd = System.nanoTime()-startAdd;
        double resAdd = (double)timeAdd  / 1000000000.0;

        for (int i = size/2; i< size;i++){
            linkedHashMap.put(i,"Map"+i);
        }

        long startRemove = System.nanoTime();
        for (int i = size/2; i< size;i++) {
            linkedHashMap.remove( i);
        }
        long timeRemove = System.nanoTime()-startRemove;
        double resRemove = (double)timeRemove/ 1000000000.0;

        System.out.println("linkedHashMap add = "+ resAdd);
        System.out.println("linkedHashMap remove = "+ resRemove);
    }
}
