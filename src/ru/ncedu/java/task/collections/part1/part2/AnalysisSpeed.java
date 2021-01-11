package ru.ncedu.java.task.collections.part1.part2;

import java.util.*;

public class AnalysisSpeed {
    public static void main(String[] args){
       arrayList();
       linkedList();
        hashSet();
        linkedHashSet();
        treeSet();
        hashMap();
        linkedHashMap();treeMap();
    }
    //list
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

    //Set

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
    public static void linkedHashSet(){
        int size = 100000;
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();

        long startAdd = System.nanoTime();
        for (int i = 0; i< size/2;i++){
            linkedHashSet.add("Set"+i);
        }
        long timeAdd = System.nanoTime()-startAdd;
        double resAdd = (double)timeAdd  / 1000000000.0;

        for (int i = size/2; i< size;i++){
            linkedHashSet.add("Hash"+i);
        }
        long startRemove = System.nanoTime();
        for (int i = 0; i<size;i++) {
                linkedHashSet.remove("Hash" + i);
        }
        long timeRemove = System.nanoTime()-startRemove;
        double resRemove = (double)timeRemove/ 1000000000.0;

        System.out.println("linkedHashSet add = "+ resAdd);
        System.out.println("linkedHashSet remove = "+ resRemove);
    }
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

    //Map

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
    public static void linkedHashMap(){
        int size = 100000;
        LinkedHashMap linkedHashMap = new LinkedHashMap<>();

        long startAdd = System.nanoTime();
        for (int i = 0; i< size/2;i++){
            linkedHashMap.put(i,"Hash"+i);
        }
        long timeAdd = System.nanoTime()-startAdd;
        double resAdd = (double)timeAdd  / 1000000000.0;

        for (int i = size/2; i< size;i++){
            linkedHashMap.put(i,"Map"+i);
        }

        long startRemove = System.nanoTime();
        for (int i = size/2; i< size;i++) {
            linkedHashMap.remove( i);
        }
        long timeRemove = System.nanoTime()-startRemove;
        double resRemove = (double)timeRemove/ 1000000000.0;

        System.out.println("linkedHashMap add = "+ resAdd);
        System.out.println("linkedHashMap remove = "+ resRemove);
    }
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
