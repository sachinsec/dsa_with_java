
class CustomQ{
    private int [] data;
    private static final int DEFAULT_SIZE = 10;
    int end = 0;

    public CustomQ(){
        this(DEFAULT_SIZE);
    }
    public CustomQ(int size){
        this.data = new int[size];
    }
    public boolean isFull(){
        return end == data.length; //ptr is at last index
    }
    public boolean isEmpty(){
        return end == 0;
    }
    public boolean insert(int item){
        if(isFull()){
            return false;
        }
        data[end++] = item;
        return true;
    }
    public int remove() throws Exception{
        if (isEmpty()) {
            throw new Exception("Queue is Empty");
        }
        int removed = data[0];

         // shift the elements to left
         for (int i = 1; i < end; i++) {
            data[i-1] = data[i];
         }
         end --;

        return removed;
        
    }
    public int front()throws Exception{
     if (isFull()) {
        throw new Exception("Queue is Empty");
     }
     return data[0];
    }

    public void Display(){
        for (int i = 0; i < end; i++) {
            System.out.print(data[i]+" <- ");
        }
        System.out.println("END");
    }
}


// Main class
public class CustomQueue {
    public static void main(String[] args)throws Exception {

        CustomQ q = new CustomQ();
        q.remove();
        q.insert(10);
        q.insert(20);
        q.insert(30);
        q.insert(40);
        q.insert(50);
        
        System.out.println("Remove"+q.remove());
        q.Display();
        System.out.println(q.front());
    }
}
