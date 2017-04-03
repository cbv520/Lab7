import java.util.*;

public class DSAStack<E> implements Iterable<E>
{
    private DSALinkedList<E> list;

    DSAStack()
    {
        list = new DSALinkedList<E>();
    }

    public Iterator<E> iterator()
    {
        return list.iterator();
    }

    public boolean isEmpty()
    {
        return list.isEmpty();
    }

    public void push(E inObject)
    {
        list.insertFirst(inObject);
    }

    public E pop()
    {
        return list.removeFirst();
    }

    public E top()
    {
        return list.peekFirst();
    }
}
