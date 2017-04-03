import java.util.*;

public class DSAQueue<E> implements Iterable<E>
{
    private DSALinkedList<E> list;

    DSAQueue()
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

    public void enqueue(E inObj)
    {
        list.insertLast(inObj);
    }

    public E dequeue()
    {
        return list.removeFirst();
    }

    public E peak()
    {
        return list.peekFirst();
    }
}
