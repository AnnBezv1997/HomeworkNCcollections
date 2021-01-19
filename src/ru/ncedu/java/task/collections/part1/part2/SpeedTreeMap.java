package ru.ncedu.java.task.collections.part1.part2;

import java.util.TreeMap;

public class SpeedTreeMap {
    public static void treeMap(){
        int size = 100000;
        TreeMap treeMap = new TreeMap<>();

        long startAdd = System.nanoTime();
        for (int i = 0; i< size/2;i++){
            treeMap.put(i,"Hash"+i);
        }
        long timeAdd = System.nanoTime()-startAdd;
        double resAdd = (double)timeAdd  / 1000000000.0;

        for (int i = size/2; i< size;i++){
            treeMap.put(i,"Map"+i);
        }

        long startRemove = System.nanoTime();
        for (int i = size/2; i< size;i++) {
            treeMap.remove( i);
        }
        long timeRemove = System.nanoTime()-startRemove;
        double resRemove = (double)timeRemove/ 1000000000.0;

        System.out.println("TreeMap add = "+ resAdd);
        System.out.println("TreeMap remove = "+ resRemove);
    }
}
