import java.util.*;

public class IteratorTestHarness
{
    public static void main(String args[])
    {
        DSALinkedList<String> list = new DSALinkedList<String>();
        list.insertLast(new String("1"));
        list.insertLast(new String("2"));
        list.insertLast(new String("3"));
        list.insertLast(new String("4"));
        list.insertLast(new String("5"));
        list.insertLast(new String("6"));
        list.insertLast(new String("7"));
        
        Iterator iter = list.iterator();
        for(String s : list)
        {
            System.out.println(s);
        }

        //list.insert(new Integer(8));
    }
}
