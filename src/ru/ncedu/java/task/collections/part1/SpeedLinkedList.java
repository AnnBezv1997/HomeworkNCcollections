package ru.ncedu.java.task.collections.part1;

import java.util.LinkedList;

public class SpeedLinkedList {
    public static void testTimeList(){
        LinkedList<String> speedLinkedList = new LinkedList<>();
        long size = 100000;

        long timeThisStart = System.nanoTime();
        for (int i = 0; i< size;i++){
            speedLinkedList.add("List");
        }
        long timeThis = System.nanoTime()-timeThisStart;
        double thisRes = (double)timeThis/ 1000000000.0 ;

        long thisSrartRemove = System.nanoTime();
        for (int i = 0; i < size/2; i++){
            speedLinkedList.remove(i);
        }
        long thisTimeRemove = System.nanoTime() -thisSrartRemove;
        double thisResRemove = (double)thisTimeRemove/ 1000000000.0 ;

        System.out.println("LinkedList add = " + thisRes);
        System.out.println("LinkedList remove = "+ thisResRemove);
    }

}
