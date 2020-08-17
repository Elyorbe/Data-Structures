package tech.ibrokhimov.datastructures.bag;

public interface Bag<Item> extends Iterable<Item> {
    void add(Item item);
    boolean isEmpty();
    int size();
}
