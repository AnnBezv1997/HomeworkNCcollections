package ru.ncedu.java.task.collections.part1;

public class Node<E> {
    private E element;
    private Node<E> nextNode;

    public Node(E element) {
        this.element = element;
    }

    public Node(E element, Node<E> nextNode) {
        this.element = element;
        this.nextNode = nextNode;
    }

    public void setElement(E element) {
        this.element = element;
    }

    public E getElement() {
        return element;
    }

    public void setNextNode(Node<E> nextNode) {
        this.nextNode = nextNode;
    }

    public Node<E> getNextNode() {
        return nextNode;
    }

    @Override
    public String toString() {
        return "Node[" +
                "element=" + element +
                ", nextNode=" + nextNode +
                ']';
    }
}
