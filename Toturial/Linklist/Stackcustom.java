class Node {
    int val;
    Node next;
    public Node(int val) {
        this.val = val;
    }
}

class MyStack {
    Node head;
    int len = 0;

    int peek() throws Exception {
        if (len == 0) {
            throw new Exception("Stack_Underflow_Error!");
        }
        return head.val;
    }

    int pop() throws Exception { // deleteAtHead
        if (head == null) {
            throw new Exception("Stack_Under_Flow_Error");
        }
        int x = head.val;
        head = head.next;
        len--;
        return x;
    }

    void push(int ele) { // addAtHead
        Node temp = new Node(ele);
        temp.next = head;
        head = temp;
        len++;
    }

    int size() {
        return len;
    }

    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.val);
            temp = temp.next;
        }
    }
}

public class Stackcustom {
    public static void main(String[] args) throws Exception {
        MyStack st = new MyStack();
        
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);

        st.pop();
        st.display();
    }
}