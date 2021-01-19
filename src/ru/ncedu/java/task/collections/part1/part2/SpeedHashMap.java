package ru.ncedu.java.task.collections.part1.part2;

import java.util.HashMap;

public class SpeedHashMap {
    public static void hashMap(){
    int size = 100000;
    HashMap hashMap = new HashMap<>();

    long startAdd = System.nanoTime();
    for (int i = 0; i< size/2;i++){
        hashMap.put(i,"Hash"+i);
    }
    long timeAdd = System.nanoTime()-startAdd;
    double resAdd = (double)timeAdd  / 1000000000.0;

    for (int i = size/2; i< size;i++){
        hashMap.put(i,"Map"+i);
    }

    long startRemove = System.nanoTime();
    for (int i = size/2; i< size;i++) {
        hashMap.remove( i);
    }
    long timeRemove = System.nanoTime()-startRemove;
    double resRemove = (double)timeRemove/ 1000000000.0;

    System.out.println("HashMap add = "+ resAdd);
    System.out.println("HashMap remove = "+ resRemove);
}
}
