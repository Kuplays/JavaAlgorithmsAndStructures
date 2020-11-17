package custom_collections;

import custom_exceptions.EmptyStackException;
import structure_utils.ListNode;
import structure_utils.StackInterface;

/*
Stack realisation on linked list nodes.
Methods work in constant time as we push to list
head.
 */
public class Stack<T> implements StackInterface<T> {
    private ListNode<T> nodeTop;
    private int size;

    public Stack() {
        this.nodeTop = null;
        this.size = 0;
    }

    @Override
    public void push(T element) {
        ListNode<T> nodeToInsert = new ListNode<T>(element, this.nodeTop);
        this.nodeTop = nodeToInsert;
        this.size += 1; //non atomic
    }

    @Override
    public T pop() throws EmptyStackException {
        if (isEmpty()) throw new EmptyStackException("Cannot pop element, stack is empty.");
        T headElement = this.nodeTop.getElement();
        this.nodeTop = this.nodeTop.getNextPointer();
        this.size -= 1;

        return headElement;
    }

    @Override
    public T top() throws EmptyStackException {
        if (isEmpty()) throw new EmptyStackException("Cannot get top element, stack is empty.");
        return this.nodeTop.getElement();
    }

    @Override
    public boolean isEmpty() {
        return this.nodeTop == null;
    }

    @Override
    public int size() {
        return this.size;
    }
}
