package ru.ncedu.java.task.collections.part1.part2;

import java.util.LinkedList;

public class SpeedLinkedList {
    public static void linkedList(){
        int size = 100000;
        LinkedList<String> linkedList = new LinkedList<>();

        long startAdd = System.nanoTime();
        for (int i = 0; i< size;i++){
            linkedList.add("List");
        }
        long timeAdd = System.nanoTime()-startAdd;
        double resAdd = (double)timeAdd/ 1000000000.0;

        long startGet = System.nanoTime();
        linkedList.get(size-12345);
        long timeGet = System.nanoTime()-startGet;
        double resGet = (double)timeGet/ 1000000000.0;

        long startRemove = System.nanoTime();
        for (int i = 0; i < size/2;i++){
            linkedList.remove(i);
        }
        long timeRemove = System.nanoTime()-startRemove;
        double resRemove = (double)timeRemove/ 1000000000.0;

        System.out.println("LinkedList add = "+ resAdd);
        System.out.println("LinkedList get(i) = "+ resGet);
        System.out.println("LinkedList remove = "+ resRemove);
    }
}
