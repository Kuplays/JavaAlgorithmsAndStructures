package structure_utils;

import custom_exceptions.EmptyStackException;

/*
Stack methods to work as LIFO
 */
public interface StackInterface<T> {
    /*
    Pushes new element to the stack
    @param element An element to push into
    the stack.
     */
    void push(T element);
    /*
    Deletes an element from stack`s head
    and returns it.
    @return Current head element
    @exception Empty stack exception if there is
    nothing to pop.
     */
    T pop() throws EmptyStackException;
    /*
    Returns stack element on the top or head.
    @return Current head element without deleting
    it.
    @exception Empty stack will be raised if there is
    nothing to top (or peek)
     */
    T top() throws EmptyStackException;
    /*
    Checks whether stack is empty or not.
    @return True if empty, False otherwise.
     */
    boolean isEmpty();
    /*
    Returns size of stack.
    @return Current stack size.
     */
    int size();
}
