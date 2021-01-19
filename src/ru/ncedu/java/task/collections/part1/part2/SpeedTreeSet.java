package ru.ncedu.java.task.collections.part1.part2;

import java.util.TreeSet;

public class SpeedTreeSet {
    public static void treeSet(){
        int size = 100000;
        TreeSet<String> treeSet = new TreeSet<>();

        long startAdd = System.nanoTime();
        for (int i = 0; i< size/2;i++){
            treeSet.add("Set"+i);
        }
        long timeAdd = System.nanoTime()-startAdd;
        double resAdd = (double)timeAdd  / 1000000000.0;

        for (int i = size/2; i< size;i++){
            treeSet.add("Hash"+i);
        }

        long startRemove = System.nanoTime();
        for (int i = 0; i<size;i++) {
            treeSet.remove("Hash" + i);
        }
        long timeRemove = System.nanoTime()-startRemove;
        double resRemove = (double)timeRemove/ 1000000000.0;

        System.out.println("TreeSet add = "+ resAdd);
        System.out.println("TreeSet remove = "+ resRemove);
    }
}
