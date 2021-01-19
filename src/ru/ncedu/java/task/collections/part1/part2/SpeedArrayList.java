package ru.ncedu.java.task.collections.part1.part2;

import java.util.ArrayList;

public class SpeedArrayList {
    public static void arrayList(){
        int size = 100000;
        ArrayList<String> arraylist = new ArrayList();

        long startAdd = System.nanoTime();
        for (int i = 0; i< size;i++){
            arraylist.add("List");
        }
        long timeAdd = System.nanoTime()-startAdd;
        double resAdd = (double)timeAdd/ 1000000000.0;

        long startGet = System.nanoTime();
        arraylist.get(size-12345);
        long timeGet = System.nanoTime()-startGet;
        double resGet = (double)timeGet/ 1000000000.0;

        long startRemove = System.nanoTime();
        for (int i = 0; i < size/2;i++){
            arraylist.remove(i);
        }
        long timeRemove = System.nanoTime()-startRemove;
        double resRemove = (double)timeRemove/ 1000000000.0;

        System.out.println("ArrayList add = "+ resAdd);
        System.out.println("ArrayList get(i) = "+ resGet);
        System.out.println("ArrayList remove = "+ resRemove);
    }
}
