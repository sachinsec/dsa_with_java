//InbuiltExample

/*

<< Keyword For Stack>>
______________________
.push --> data insert ( Insert a new element on the top)
.pop --> data remove (Sabse upar wale ko hta deta hai.)
.peek --> View top (It shows the top element of stack.)
.isEmpty --> Empty or Not (as True or False)


<< Keyword For the Queue >>
___________________________
queue.offer(element like 4) --> It insert the data behind the queue.(If queue is full. It's return false without any crash9ing in the program )
queue.add(elements --> It insert the data behind the queue (If queue is full. It's throw the error)
".poll() --> It removes the first element of the queue and return its.If the queue is empty then it's not crashing.
".remove() --> It remvoves the first element ofthe queue but queue is empty then throw the error.
".peek() --> seeing the first element of the line Without removing its.
".element() --> Same works like peek but throw the error in empty. 


<< Keyword For the  Deque >>
____________________________

deque.offerFirst(element) --> Add elements in the first.
.offerLast() --> Add element in the last.
.pollFirst() --> remove the first elements.
.pollLast() --> remove the last elements.
.peekFirst() --> Only showing the first elements.\
.peekLast() --> """" last elements.
 
### IMportant ( 1. When we write dq.push(e) then it calls the addFirst().
2. When we write dq.pop() then it calls the removeFirst())



*/

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class SQ_DataStructure {
    public static void main(String[] args) {
        
        Stack<Integer> stack = new Stack<>();
        // stack.push(34);
        // stack.push(44);
        // stack.push(64);
        // stack.push(04);
        // stack.push(43);
        
        // System.out.println(stack.pop());
        // System.out.println(stack.pop());
        // System.out.println(stack.pop());
        // System.out.println(stack.pop());
        // System.out.println(stack.pop());

        Queue<Integer> queue = new LinkedList<>();
        // queue.add(3);
        // queue.add(5);
        // queue.add(8);
        // queue.add(9);
        // queue.add(0);

        // System.out.println(queue.remove());
        // System.out.println(queue.remove());
        // System.out.println(queue.remove());
        // System.out.println(queue.remove());
        // System.out.println(queue.remove()); 
        // System.out.println(queue);

        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(89);
        deque.addLast(25);
        deque.removeFirst();
    }
}  
