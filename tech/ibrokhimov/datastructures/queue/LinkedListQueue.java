package tech.ibrokhimov.datastructures.queue;

import java.util.Iterator;

public class LinkedListQueue<Item> implements Queue<Item> {
    private Node first;
    private Node last;;
    private int N;

    private class Node {
        Item item;
        Node next;
    }

    @Override
    public void enqueue(Item item) {
        Node oldLast = last;
        last = new Node();
        last.item = item;
        last.next = null;
        if(isEmpty())
            first = last;
        else
            oldLast.next = last;
        N++;
    }

    @Override
    public Item dequeue() {
        Item item = first.item;
        first = first.next;
        if(isEmpty())
            last = null;
        N--;
        return item;
    }

    @Override
    public boolean isEmpty() {
        return N == 0;
    }

    @Override
    public int size() {
        return N;
    }

    @Override
    public Iterator<Item> iterator() {
        return new ListIterator();
    }
    private class ListIterator implements Iterator<Item> {
        private Node current = first;

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public Item next() {
            Item item = current.item;
            current = current.next;
            return item;
        }
    }
}
