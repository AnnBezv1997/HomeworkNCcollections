package ru.ncedu.java.task.collections.part1.part2;

import java.util.LinkedHashSet;

public class SpeedLinkedHashSet {
    public static void linkedHashSet(){
        int size = 100000;
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();

        long startAdd = System.nanoTime();
        for (int i = 0; i< size/2;i++){
            linkedHashSet.add("Set"+i);
        }
        long timeAdd = System.nanoTime()-startAdd;
        double resAdd = (double)timeAdd  / 1000000000.0;

        for (int i = size/2; i< size;i++){
            linkedHashSet.add("Hash"+i);
        }
        long startRemove = System.nanoTime();
        for (int i = 0; i<size;i++) {
            linkedHashSet.remove("Hash" + i);
        }
        long timeRemove = System.nanoTime()-startRemove;
        double resRemove = (double)timeRemove/ 1000000000.0;

        System.out.println("linkedHashSet add = "+ resAdd);
        System.out.println("linkedHashSet remove = "+ resRemove);
    }
}
