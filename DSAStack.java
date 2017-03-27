import java.util.*;

public class DSAStack implements Iterable
{
    private DSALinkedList list;

    DSAStack()
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

    public void push(Object inObject)
    {
        list.insertFirst(inObject);
    }

    public Object pop()
    {
        return list.removeFirst();
    }

    public Object top()
    {
        return list.peekFirst();
    }
}
