package tech.ibrokhimov.datastructures.stack;

/**
 *
 * @author Elyor*/

public interface Stack<Item> extends Iterable<Item> {
    void push(Item item);
    Item pop();
    boolean isEmpty();
    int size();
}
