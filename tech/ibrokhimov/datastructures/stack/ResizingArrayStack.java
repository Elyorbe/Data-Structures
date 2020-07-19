package tech.ibrokhimov.datastructures.stack;

import java.util.Iterator;

public class ResizingArrayStack<Item> implements Stack<Item> {
    private Item[] a = (Item[]) new Object[1];
    private int N = 0;

    @Override
    public void push(Item item) {
        if(N == a.length)
            resize(2 * a.length);
        a[N++] = item;
    }

    @Override
    public Item pop() {
        if(N <= 0)
            return null;
        Item item = a[--N];
        a[N] = null; //Avoid loitering
        if(N > 0 && N == a.length/4)
            resize(a.length/2);
        return item;
    }

    private void resize(int max) {
        Item[] temp = (Item[]) new Object[max];
        for(int i = 0; i < N; i++)
            temp[i] = a[i];
        a = temp;
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
    public Iterator iterator() {
        return new ReverseArrayIterator();
    }

    private class ReverseArrayIterator implements Iterator<Item> {
        //Support LIFO operation
        private int i = N;

        @Override
        public boolean hasNext() {
            return i > 0;
        }

        @Override
        public Item next() {
            return a[--i];
        }

        @Override
        public void remove() {

        }
    }
}
