package ru.ncedu.java.task.collections.part1;
import java.util.Arrays;
import java.util.Iterator;
import java.util.function.Consumer;

import static ru.ncedu.java.task.collections.part1.SpeedLinkedList.testTimeList;
import static ru.ncedu.java.task.collections.part1.SpeedMyList.testTimeMyList;

public class Main {
    public static void main(String[] args){
        MyLinkedList<String> myLinkedList = new MyLinkedList<>();
        myLinkedList.add("my");myLinkedList.add("linked");myLinkedList.add("collections");
        myLinkedList.add("list");myLinkedList.add("return");myLinkedList.add("element");
        System.out.println(myLinkedList.toString());//MyLinkedList [my, linked, collections, list, return, element]
        myLinkedList.set(0,"head");
        System.out.println(myLinkedList.toString());//MyLinkedList [head, linked, collections, list, return, element]
        myLinkedList.remove(0);
        System.out.println(myLinkedList.toString());//MyLinkedList [linked, collections, list, return, element]
        System.out.println(myLinkedList.get(4));//element
        String[] arr = myLinkedList.toArray();
        System.out.println(Arrays.toString(arr));//[linked, collections, list, return, element]
        System.out.println(myLinkedList.indexOf("list"));//2

        myLinkedList.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });
        for(String s : myLinkedList){
             System.out.println(s);
        }
        Iterator iter = myLinkedList.iterator();
        while (iter.hasNext()){
            System.out.println(iter.next());
        }
        /** Все(myLinkedList.forEach; for(String s : myLinkedList); while (iter.hasNext())) выводят:
         * linked
         * collections
         * list
         * return
         * element
         */
        myLinkedList.clear();
        System.out.println(myLinkedList.toString());//MyLinkedList null

      testTimeMyList();
      testTimeList();
    }

}
