package structure_utils;

/*
Generic List Node class to be used
in linked lists. Possibly rewrite to
extend from base class. Holds a T element
and pointer to a next node.
 */
public class ListNode<T> {
    private T element;
    private ListNode<T> nextPointer;

    /*
    Parametric constructor. Creates new instance of node
    @param newElement element to pass when creating.
    @param pointer which node to point to
     */
    public ListNode(T newElement, ListNode<T> pointer) {
        this.element = newElement;
        this.nextPointer = pointer;
    }

    /*
    Base empty constructor. Calls parametric one with
    null values.
     */
    public ListNode() {
        this(null, null);
    }

    /*
    @return An element within a node
     */
    public T getElement() {
        return element;
    }

    /*
    Sets an element within a node
    @param element New element to set as.
     */
    public void setElement(T element) {
        this.element = element;
    }

    /*
    @return Pointer to another node in the list.
     */
    public ListNode<T> getNextPointer() {
        return nextPointer;
    }

    /*
    Sets new pointer.
    @param nextPointer which node to point to.
     */
    public void setNextPointer(ListNode<T> nextPointer) {
        this.nextPointer = nextPointer;
    }
}
