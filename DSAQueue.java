import java.util.*;

public class DSAQueue implements Iterable
{
    private DSALinkedList list;

    DSAQueue()
    {
        list = new DSALinkedList();
    }

    public Iterator iterator()
    {
        return list.iterator();
    }

    public boolean isEmpty()
    {
        return list.isEmpty();
    }

    public void enqueue(Object inObj)
    {
        list.insertLast(inObj);
    }

    public Object dequeue()
    {
        return list.removeFirst();
    }

    public Object peak()
    {
        return list.peekFirst();
    }
}
