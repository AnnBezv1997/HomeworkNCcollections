package ru.ncedu.java.task.collections.part1;

public class SpeedMyList {
    public static void testTimeMyList(){
        MyLinkedList<String> speedMyLinkedList = new MyLinkedList<>();
        int size = 100000;

        long myStartAdd = System.nanoTime();
        for (int i = 0; i< size;i++){
            speedMyLinkedList.add("List");
        }
        long myTimeAdd = System.nanoTime()-myStartAdd;
        double myResAdd = (double)myTimeAdd/ 1000000000.0 ;


        long mySrartRemove = System.nanoTime();
        for (int i = 0; i < size/2; i++){
            speedMyLinkedList.remove(i);
        }
        long myTimeRemove = System.nanoTime() -mySrartRemove;
        double myResRemove = (double)myTimeRemove/ 1000000000.0 ;

        System.out.println("MyLinkedList add = " + myResAdd);
        System.out.println("MyLinkedList remuve = " + myResRemove);
    }
}
