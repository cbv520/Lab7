public class TestLists
{
    public static void main(String[] args)
    {
        String s1 = "1";
        String s2 = "2";
        String s3 = "3";
        String s4 = "4";
        String s5 = "5";

        DSALinkedList list = new DSALinkedList();
        DSAQueue queue = new DSAQueue();
        DSAStack stack = new DSAStack();

        System.out.println("-------------------");
        System.out.println("LINKED LIST TESTS");
        System.out.println("-------------------");

        System.out.println("inserting sequence 1,2,3,4,5\n");

        System.out.println("Insert first, Remove last");
        list.insertFirst(s1);
        list.insertFirst(s2);
        list.insertFirst(s3);
        list.insertFirst(s4);
        list.insertFirst(s5);
        System.out.println("First: " + list.peekFirst() + ", Last: "+ list.peekLast());
        System.out.print("Expecting ascending order: ");
        while(!list.isEmpty())
        {
            System.out.print(list.removeLast());
        }
        System.out.println("\nFirst: " + list.peekFirst() + ", Last: "+ list.peekLast());
        System.out.println("");

        System.out.println("Insert first, Remove first");
        list.insertFirst(s1);
        list.insertFirst(s2);
        list.insertFirst(s3);
        list.insertFirst(s4);
        list.insertFirst(s5);
        System.out.println("First: " + list.peekFirst() + ", Last: "+ list.peekLast());
        System.out.print("Expecting descending order: ");
        while(!list.isEmpty())
        {
            System.out.print(list.removeFirst());
        }
        System.out.println("\nFirst: " + list.peekFirst() + ", Last: "+ list.peekLast());
        System.out.println("");

        System.out.println("Insert last, Remove last");
        list.insertLast(s1);
        list.insertLast(s2);
        list.insertLast(s3);
        list.insertLast(s4);
        list.insertLast(s5);
        System.out.println("First: " + list.peekFirst() + ", Last: "+ list.peekLast());
        System.out.print("Expecting descending order: ");
        while(!list.isEmpty())
        {
            System.out.print(list.removeLast());
        }
        System.out.println("\nFirst: " + list.peekFirst() + ", Last: "+ list.peekLast());
        System.out.println("");

        System.out.println("Insert last, Remove first");
        list.insertLast(s1);
        list.insertLast(s2);
        list.insertLast(s3);
        list.insertLast(s4);
        list.insertLast(s5);
        System.out.println("First: " + list.peekFirst() + ", Last: "+ list.peekLast());
        System.out.print("Expecting ascending order: ");
        while(!list.isEmpty())
        {
            System.out.print(list.removeFirst());
        }
        System.out.println("\nFirst: " + list.peekFirst() + ", Last: "+ list.peekLast());
        System.out.println("");

        System.out.println("-------------------");
        System.out.println("QUEUE TESTS");
        System.out.println("-------------------");

        System.out.println("queueing sequence 1,2,3,4,5\n");

        queue.enqueue(s1);
        queue.enqueue(s2);
        queue.enqueue(s3);
        queue.enqueue(s4);
        queue.enqueue(s5);
        System.out.println("front of queue: " + queue.peak());
        System.out.print("Dequeueing: ");
        while(!queue.isEmpty())
        {
            System.out.print(queue.dequeue());
        }
        System.out.println("\n");
        System.out.println("front of dequeued queue: " + queue.peak());

        System.out.println("-------------------");
        System.out.println("STACK TESTS");
        System.out.println("-------------------");

        System.out.println("stacking sequence 1,2,3,4,5\n");

        stack.push(s1);
        stack.push(s2);
        stack.push(s3);
        stack.push(s4);
        stack.push(s5);
        System.out.println("top of stack: " + stack.top());
        System.out.print("popping: ");
        while(!stack.isEmpty())
        {
            System.out.print(stack.pop());
        }
        System.out.println("\n");
        System.out.println("top of popped stack: " + stack.top());

        System.out.println("-------------------");
        System.out.println("ERROR TESTING");
        System.out.println("-------------------");
        try
        {
            System.out.println("Attemping to remove from empty list");
            list.removeLast();
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage() + "\n");
        }

        try
        {
            System.out.println("Attemping to dequeue from empty queue");
            queue.dequeue();
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage() + "\n");
        }

        try
        {
            System.out.println("Attemping to pop from empty stack");
            stack.pop();
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage() + "\n");
        }
    }
}
