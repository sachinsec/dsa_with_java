class  CirQueuecustom1{
    private int[] data;
    static private int DEFAULT_SIZE = 10;

    protected int end = 0;
    protected int front = 0;
    protected int size = 0;

    public CirQueuecustom1(){
        this(DEFAULT_SIZE);
    }
    public CirQueuecustom1(int size){
       this.data = new int[size];
    }

    public boolean isFull(){
        return size == data.length;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    
    public boolean insert(int val){

        if (isFull()) {
            return false;
        }
        data[end++]=val;
        end = end % data.length;
        size++;
        return true;
    }

    public int remove() throws Exception{
        if (isEmpty()) {
            throw new Exception("Queue is empty");
        }
        int removed = data[front];
        front = front % data.length;
        size--;
        return removed;
    }

     public int Front()throws Exception{
        if (isEmpty()) {
            throw new Exception("queue is mepty");
        }
        return data[front];
    }
     public void Display(){
            for (int i = 0; i < end; i++) {
                System.out.println(data[i]);
            }
    }

}

public class CircularQue {
    public static void main(String[] args) {
        CirQueuecustom1 cq =new CirQueuecustom1();
        cq.insert(1);
        cq.insert(2);
        cq.insert(3);
        cq.insert(4);
        cq.insert(5);
        cq.insert(6);
        cq.Display();
    }
}
