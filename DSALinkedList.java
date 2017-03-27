import  java.util.*;

public class DSALinkedList<E> implements Iterable<E>
{
    private DSAListNode<E> head;
    private DSAListNode<E> tail;

    DSALinkedList()
    {
        head = null;
        tail = null;
    }

    public Iterator<E> iterator()
    {
        return new DSALinkedListIterator<E>(this);
    }

    public void insertFirst(E inObject)
    {
        DSAListNode<E> newNode = new DSAListNode<E>(inObject);

        if(isEmpty())
        {
            head = newNode;
            tail = newNode;
        }
        else
        {
            head.setPrev(newNode);
            newNode.setNext(head);
            head = newNode;
        }
    }

    public void insertLast(E inObject)
    {
        DSAListNode<E> newNode = new DSAListNode<E>(inObject);

        if(isEmpty())
        {
            head = newNode;
            tail = newNode;
        }
        else
        {
            tail.setNext(newNode);
            newNode.setPrev(tail);
            tail = newNode;
        }
    }

    public boolean isEmpty()
    {
        return (head == null && tail == null);
    }

    public E peekFirst()
    {
        E firstObj = null;

        if(head != null)
        {
            firstObj = head.getValue();
        }
        return firstObj;
    }

    public E peekLast()
    {
        E lastObj = null;

        if(tail != null)
        {
            lastObj = tail.getValue();
        }
        return lastObj;
    }

    public E removeFirst()
    {
        E returnObj = null;

        if(isEmpty())
        {
            throw new NullPointerException("Linked list is empty");
        }
        else
        {
            returnObj = head.getValue();
            head = head.getNext();
            if(head == null)
            {
                tail = null;
            }
        }

        return returnObj;
    }

    public E removeLast()
    {
        E returnObj = null;

        if(isEmpty())
        {
            throw new NullPointerException("Linked list is empty");
        }
        else
        {
            returnObj = tail.getValue();
            tail = tail.getPrev();
            if(tail == null)
            {
                head = null;
            }
        }

        return returnObj;
    }

    private class DSAListNode<E>
    {
        private E value;
        private DSAListNode<E> prev;
        private DSAListNode<E> next;

        DSAListNode(E inVal)
        {
            value = inVal;
            prev = null;
            next = null;
        }

        public E getValue()
        {
            return value;
        }

        public void setValue(E inVal)
        {
            value = inVal;
        }

        public DSAListNode<E> getNext()
        {
            return next;
        }

        public void setNext(DSAListNode<E> inNext)
        {
            next = inNext;
        }

        public DSAListNode<E> getPrev()
        {
            return prev;
        }

        public void setPrev(DSAListNode<E> inPrev)
        {
            prev = inPrev;
        }
    }

    private class DSALinkedListIterator<E> implements Iterator<E>
    {
        private DSALinkedList<E>.DSAListNode<E> iterNext;
        
        public DSALinkedListIterator(DSALinkedList<E> list)
        {
            iterNext = list.head;
        }

        public boolean hasNext()
        {
            return iterNext != null;
        }

        public E next()
        {
            E value;
            if(iterNext == null)
            {
                value = null;
            }
            else
            {
                value = iterNext.getValue();
                iterNext = iterNext.getNext();
            }
            return value;
        }

        public void remove()
        {
            throw new UnsupportedOperationException("Not supported");
        }
       
    }
}
