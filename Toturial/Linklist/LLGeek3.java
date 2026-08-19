class Node{
    int val;
    Node next; // Null

    public Node(int val){
        this.val = val;
    }
}

class Linkedlist{ // user defined data stractures
        Node head; //null
        Node tail; //Null
        int size;

        // Add value in the last 
        void addAtTail(int val){
            Node temp = new Node(val); // we create new block
            if (tail == null) { // if linkedlist is empty 
                head = tail = temp;
            } else{
                 tail.next = temp; // here is store value at the tail.next it means in the last
            tail = temp; // now assing temp value equal to tail now tail is temp
            }
            size++;
        }

        //ADd value at the first
        void addAtHead(int val){
            Node temp = new Node(val);
            if (head == null) {
                head = tail = temp;
            }
            temp.next = head;
            head = temp;
            size++;
        }

        //deleting value form the head
        void deleteAtHead(){
            if (head == null) {
                System.out.println("List is empty");
                return;
            }
            head = head.next;
            if (head == null) {
                tail = null;
            }
            size--;
        }

        //Indexing search values

        public int  search(int val){
            int index =0 ;
        if (head == null) {
            return -1;
        }
        Node temp = head;
        while(temp != null){
            if (temp.val == val) {
                return index;
            }
            index++;
            temp = temp.next;
        }
        return -1;
    }

    // insertindexing  at any specific inedxing 
    void insertindex(int val,int index){
        if (index<0 || head == null || index >size) {
            System.out.println("OutOfIndex");
            return;
        }
        else if(index ==0 ) addAtHead(val);
        else if(index == size) addAtTail(val);

        Node temp = head;
        for (int i = 0; i < index; i++) { // for the traversal
            temp = temp.next;
        }
        Node newNode = new Node(val); // data= 10,20,30,40,50  ( newNode = 25 here is newNode.next is Null ) temp (20)
        newNode.next = temp.next;  // newNode.next = temp.next(30) ( like newNode = 25 then newnode.next = 30  
        temp.next = newNode; // temp.next =25 (10,20,25,30,40,50)
        size++;
    }
    

    // getmethod for the access for the specific indexing

    int get(int index){
        Node temp = head;
        for (int i = 1; i <= index ; i++) {
            temp = temp.next;
        }
        return temp.val;
        }
        
        // Delete index

    void deletindex(int index){
       Node temp = head;

       if (index >= size || index < 0 ) {
        System.out.println("Invalid index");
        return;
       }if(index==0)deleteAtHead();

       for (int i = 1; i < index; i++) {
            temp  = temp.next;
       }
       temp.next = temp.next.next; // deleting value of temp.next

       if(index == size -1) tail = temp;
       size--;

      }
        // For the display
        void display(){

            if (head == null) {
                return;
            }

            for (Node temp  = head; temp != null; temp = temp.next) {
                System.out.print(temp.val+" ");   
            }
        }

}
public class LLGeek3 {
    
    public static void main(String[] args) {
        Linkedlist list = new Linkedlist();
        list.addAtTail(10);
        list.addAtTail(20);
        list.addAtTail(30); 
        list.addAtTail(40);
        list.addAtTail(50);

       // list.display();

        // System.out.println();
        // list.deleteAtHead();
        // list.display();
        // System.out.println(list.size);

        // System.out.println("After removing tail");
        // list.deleteAtTail();
        // list.display();

        // int ans = list.search(40);
        // System.out.println("Indexing value is = "+ans);

        // list.insertindex(56, 2);
        // list.display();
        // System.out.println("form the spefic method = "+list.get(3));
        list.deletindex(2);
        list.display();
        // System.out.println(list.size);
    }
}
