/**
 * Practice
 */

class Node{
    int value;
    Node next;
    public Node(int value){
        this.value = value;
    }
}

class linkedlist{
    Node head;
    Node tail;
    int size=0;

    void addtail(int value){
        Node temp = new Node(value);
        if (tail == null) {
            head = tail = temp;
        }
        tail.next = temp;
        tail = temp;
        size++;
    }

    void addhead(int value){
        Node temp = new Node(value);
        if (head == null) {
            head = tail = temp;
        }
        temp.next =  head;
          head= temp;
        size++;
    }

    void delethead(){
        if(head == null)return;
        head = head.next;

        if(head == null) tail = null;
    }

    void insert(int value , int index){
        Node temp = head;
        
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node t = new Node(value);
        t.next = temp.next;
        temp.next = t ;
    }

    int search(int value){
        int ind =0;
        Node temp = head;
        if (head == null) {
            return -1;
        }
       while (temp != null) {
           if(temp.value == value){
            return ind;
           }
           ind++;
           temp=temp.next;
       }
       return -1;
    }

    int get(int index){
        Node temp  = head;
        if (index == 0) {
            return temp.value;
        }
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp.value;
    }
    
    void deleteindex(int index){
        Node temp = head;
        if (head == null) {
            return;
        }
        for (int i = 1; i < index; i++) {
            temp=temp.next;
        }
        temp.next = temp.next.next;
    }

    void display(){
        Node temp = head;
        while(temp !=null){
        System.out.println(temp.value);
        temp = temp.next;
        }
    }
}

public class Practice {

    public static void main(String[] args) {
        linkedlist list = new linkedlist();
        list.addtail(10);
        list.addtail(20);
        list.addtail(150);
        list.addtail(106);
        list.addhead(109);

       list.insert(555, 2);
    //    System.out.println("From the get method = "+list.get(2));

        list.deleteindex(3);
       
        list.display();

        

    }
}