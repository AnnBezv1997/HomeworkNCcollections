package ru.ncedu.java.task.collections.part1;

import java.util.Arrays;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args){
        MyLinkedList<String> myLinkedList = new MyLinkedList<>();
        myLinkedList.add("my");myLinkedList.add("linked");myLinkedList.add("collections");
        myLinkedList.add("list");myLinkedList.add("return");myLinkedList.add("element");
        System.out.println(myLinkedList.toString());//MyLinkedList [my, linked, collections, list, return, element]
        myLinkedList.set(5,"head");
        System.out.println(myLinkedList.toString());//MyLinkedList [my, linked, collections, list, return, head]
        myLinkedList.remove(2);
        System.out.println(myLinkedList.toString());//MyLinkedList [my, linked, list, return, head]
        System.out.println(myLinkedList.get(4));//head
        String[] arr = myLinkedList.toArray();
        System.out.println(Arrays.toString(arr));//[my, linked, list, return, head]
        System.out.println(myLinkedList.indexOf("list"));//2
        myLinkedList.clear();
        System.out.println(myLinkedList.toString());//MyLinkedList null

      testTimeMyList();
      testTimeList();
    }

    public static void testTimeMyList(){
        MyLinkedList<String> speedMyLinkedList = new MyLinkedList<>();
        int size = 100000;

        long myStartAdd = System.nanoTime();
        for (int i = 0; i< size;i++){
            speedMyLinkedList.add("List");
        }
        long myTimeAdd = System.nanoTime()-myStartAdd;
        double myResAdd = (double)myTimeAdd/ 1000000000.0 ;


        long myStartRemove = System.nanoTime();
        for (int i = 0; i < size/2; i++){
            speedMyLinkedList.remove(i);
        }
        long myTimeRemove = System.nanoTime() -myStartRemove;
        double myResRemove = (double)myTimeRemove/ 1000000000.0 ;

        System.out.println("MyLinkedList add = " + myResAdd);
        System.out.println("MyLinkedList remuve = " + myResRemove);
    }
    public static void testTimeList(){
        LinkedList<String> speedLinkedList = new LinkedList<>();
        long size = 100000;

        long timeThisStart = System.nanoTime();
        for (int i = 0; i< size;i++){
            speedLinkedList.add("List");
        }
        long timeThis = System.nanoTime()-timeThisStart;
        double thisRes = (double)timeThis/ 1000000000.0 ;

        long thisStartRemove = System.nanoTime();
        for (int i = 0; i < size/2; i++){
            speedLinkedList.remove(i);
        }
        long thisTimeRemove = System.nanoTime() -thisStartRemove;
        double thisResRemove = (double)thisTimeRemove/ 1000000000.0 ;

        System.out.println("LinkedList add = " + thisRes);
        System.out.println("LinkedList remove = "+ thisResRemove);
    }

}
