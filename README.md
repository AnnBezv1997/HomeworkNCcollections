# HomeworkNCcollections
## 1. Написан свой связный список MyLinkedList и сравнили с LinkedList.

           Количество элементов 100000, тип  - String.
 MyLinkedList add = 0.0108815 
 MyLinkedList remuve = 5.2467667
 LinkedList add = 0.0086905
 LinkedList remove = 2.5786931
 
 Выводы очевидны)  LinkedList по всем функциям работает быстрее.

## 2. Сравнительный анализ производительности основных Java коллекций.

 a. Сравнить производительность ArrayList и LinkedList для основных операций

 ArrayList add = 0.0142024 
 ArrayList get(i) = 1.0E-7 
 ArrayList remove = 1.2392571 
 LinkedList add = 0.0094445
 LinkedList get(i) = 2.962E-4
 LinkedList remove = 2.2737295

 LinkedList добавляет элементы быстрее, удаляет медленее, чем ArrayList.

 b. Сравнить производительность HashSet, LinkedHashSet, TreeSet для основных операций
  HashSet add = 0.0626249
  HashSet remove = 0.0840084
  linkedHashSet add = 0.0943584
  linkedHashSet remove = 0.0760559
  TreeSet add = 0.1079703
  TreeSet remove = 0.1021224

TreeSet медленее всех и добавляет и удаляет. LinkedHashSet удаляет быстрее HashSet, но
HashSet добавляет элементы быстрее чем LinkedHashSet.

 c.Сравнить производительность HashMap, LinkedHashMap, TreeMap
  HashMap add = 0.1364916
  HashMap remove = 0.0085214
  linkedHashMap add = 0.1100594
  linkedHashMap remove = 0.0105017
  TreeMap add = 0.161139
  TreeMap remove = 0.0323033

TreeMap медленее всех и добавляет и удаляет. HashMap удаляет быстрее LinkedHashMap, но
LinkedHashMap добавляет элементы быстрее чем HashMap.
