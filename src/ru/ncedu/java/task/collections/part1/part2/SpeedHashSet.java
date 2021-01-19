package ru.ncedu.java.task.collections.part1.part2;

import java.util.HashSet;

public class SpeedHashSet {
    public static void hashSet(){
        int size = 100000;
        HashSet<String> hashSet = new HashSet<>();

        long startAdd = System.nanoTime();
        for (int i = 0; i< size/2;i++){
            hashSet.add("Set"+i);
        }
        long timeAdd = System.nanoTime()-startAdd;
        double resAdd = (double)timeAdd  / 1000000000.0;

        for (int i = size/2; i< size;i++){
            hashSet.add("Hash"+i);
        }

        long startRemove = System.nanoTime();
        for (int i = 0; i<size;i++) {
            hashSet.remove("Hash" + i);
        }
        long timeRemove = System.nanoTime()-startRemove;
        double resRemove = (double)timeRemove/ 1000000000.0;

        System.out.println("HashSet add = "+ resAdd);
        System.out.println("HashSet remove = "+ resRemove);
    }
}
