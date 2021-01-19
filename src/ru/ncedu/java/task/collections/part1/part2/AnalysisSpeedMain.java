package ru.ncedu.java.task.collections.part1.part2;;
import static ru.ncedu.java.task.collections.part1.part2.SpeedArrayList.arrayList;
import static ru.ncedu.java.task.collections.part1.part2.SpeedHashMap.hashMap;
import static ru.ncedu.java.task.collections.part1.part2.SpeedHashSet.hashSet;
import static ru.ncedu.java.task.collections.part1.part2.SpeedLinkedHashMap.linkedHashMap;
import static ru.ncedu.java.task.collections.part1.part2.SpeedLinkedHashSet.linkedHashSet;
import static ru.ncedu.java.task.collections.part1.part2.SpeedLinkedList.linkedList;
import static ru.ncedu.java.task.collections.part1.part2.SpeedTreeMap.treeMap;
import static ru.ncedu.java.task.collections.part1.part2.SpeedTreeSet.treeSet;

public class AnalysisSpeedMain {
    public static void main(String[] args) {
        arrayList();
        linkedList();
        hashSet();
        linkedHashSet();
        treeSet();
        hashMap();
        linkedHashMap();
        treeMap();
    }
}