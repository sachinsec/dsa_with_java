/**
 * Practice
 */
class Node{
    int val;
    Node next;
 public Node(int val){
    this.val = val;
 }
}

class MyStack{
    Node head;
    int len=0;
    void push(int val){
     Node temp = new Node(val);
     temp.next = head;
     head = temp;
     len++;

    }
    void peek()throws Exception{
        if (len == 0) {
            throw new Exception ( "Stack is overflow");
        }
        System.out.println(head.val);
    }
    int pop()throws Exception{
        if (len == 0) {
            throw new Exception("Stack is underflow");
        }
        int x = head.val;
         head =head.next;
         len--;
         return x;

    }

    void display()throws Exception{

        if(len == 0){
            throw new Exception("Stack is Empty");
        }
        while (head!=null) {
            System.out.println(head.val);
            head = head.next;
        }
    }
}
public class Practice {

    public static void main(String[] args)throws Exception {
        
        MyStack st = new MyStack();
        st.push(10);
        st.push(20);
        st.push(30);
        System.out.println("Peek Values ");
        st.peek();
        System.out.println("Removing pop");
        System.out.println(st.pop());
        System.out.println("Display");
        st.display();
    }
}