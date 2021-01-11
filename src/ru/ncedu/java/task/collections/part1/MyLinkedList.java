package ru.ncedu.java.task.collections.part1;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

public class MyLinkedList<E> implements ILinkedList<E> {
    private int size;
    private Node<E> first;
    private Node<E> last;

    @Override
    public void add(E element) {
      if(size !=0){
          Node<E> newNode = new Node<>(element);
          last.setNextNode(newNode);
          last = newNode;
      }else if( size ==0){
          first = new Node<E>(element);
          last = first;
      }
      size++;
    }

    @Override
    public void add(int index, E element) {
           if(index == size) {
               add(element);
           }else if (index >= 0 && index < size && 0 < size) {
                   Node<E> current = getCurrent(index);
                   Node<E> newNode = new Node<>(element, current.getNextNode());
                   if(index == 0) {
                       first = new Node<E>(element, first);
                   }
                   current.setNextNode(newNode);
                   size++;

           }else {
                   throw new IndexOutOfBoundsException(index + ">" + size);
           }
    }


    private Node<E> getCurrent(int index){
        Node<E> current = first;
          for(int i =0; i < index-1;i++){
              current = current.getNextNode();
          }
          return current;

    }
    @Override
    public void clear() {
        for(Node<E> x = this.first; x != null; ){
            Node<E> next = x.getNextNode();
            x.setElement(null);
            x.setNextNode(null);
            x = next;
        }

        first.setElement(null);
        last.setElement(null);
        size = 0;
    }

    @Override
    public E get(int index) {
        if(index >= 0 && index < size){
            return getCurrent(index+1).getElement();
        }else {
            throw new IndexOutOfBoundsException(index + ">" + size);
        }
    }

    @Override
    public int indexOf(E element) {
        int index = 0;
        Node<E> node = first;
        for(int i = 0; i<size;i++){
            if(element.equals(node.getElement())){
                index = i;
                break;
            }else {
                index = -1;
            }
            node = node.getNextNode();
        }
        return index;
    }

    @Override
    public E remove(int index) {
        Node<E> current = first;
        E remove;
        if(index == 0) {
            first = current.getNextNode();
            current.setNextNode(null);
            size--;
            return current.getElement();
        } else if (index > 0 && index < size) {
            current = getCurrent(index);
            remove = current.getNextNode().getElement();
            current.setNextNode(current.getNextNode().getNextNode());
            size--;
        }else {
            throw new IndexOutOfBoundsException(index + ">" + size);
        }
        return remove;
    }

    @Override
    public E set(int index, E element) {
        if (index > 0 && index < size) {
            Node<E> current = first;
            for (int i = 0; i < index; i++) {
                current = current.getNextNode();
            }
            current.setElement(element);
            return current.getElement();
        }else {
            throw new IndexOutOfBoundsException(index + ">" + size);
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public E[] toArray() {
        if(size > 0) {
            E[] array = (E[]) Array.newInstance(first.getElement().getClass(), size);
            int i = 0;
            E[] res = array;
            Node<E> node;
            for(node = first; node!= null;node = node.getNextNode()){
               res[i++] = node.getElement();
            }
            return array;
        }else return null;
    }

    @Override
    public String toString() {
        return "MyLinkedList "+ Arrays.toString(toArray());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyLinkedList<?> that = (MyLinkedList<?>) o;
        return  (size == that.size) &&
                Objects.equals(first,that.first) &&
                Objects.equals(last,that.last);
    }

    @Override
    public int hashCode() {
        return Objects.hash(first,last,size);
    }

    @Override
    public Iterator<E> iterator() {
        return new ListIterator<>();
    }
    /**
     * класс для итератора
     */
    private class ListIterator<E> implements Iterator<E>{
        private Node<E> current;

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public E next() {
           E data = (E)current.getElement();
           current = current.getNextNode();
           return data;
        }
    }
}
