import java.util.Arrays;

/**
 * Practice
 */

class Queuecustom{
    private int[] data;
    static private int DEFAULT_SIZE = 10;
    int end = 0;

    public Queuecustom(){
        this(DEFAULT_SIZE);
    }
    public Queuecustom(int size){
       this.data = new int[size];
    }

    public boolean isFull(){
        return end == data.length;
    }

    public boolean isEmpty(){
        return end == 0;
    }

    public boolean insert(int val)throws Exception{

        if (isFull()) {
            throw new Exception("Queue is full");
        }
        data[end++]=val;
        return true;
    }

    public int remove() throws Exception{
        if (isEmpty()) {
            throw new Exception("Queue is empty");
        }
        int removed = data[0];

        for (int i = 1; i < end; i++) {
            data[i-1] = data[i];
    }
        end --;
        return removed;
    }
    public int Front()throws Exception{
        if (isEmpty()) {
            throw new Exception("queue is mepty");
        }
        return data[0];
    }

    public void Display()throws Exception{
        if (isEmpty()){
            throw new Exception("Queue is empty");
        }
            for (int i = 0; i < end; i++) {
                System.out.println(data[i]);
            }
    }
}
public class Practice {

    public static void main(String[] args)throws Exception {
        Queuecustom qq = new Queuecustom();
        qq.insert(10);
        qq.insert(20);
        qq.insert(40);
        qq.insert(50);
        qq.insert(60);
        qq.insert(70);
        qq.insert(80);
        qq.insert(90);
        qq.insert(100);
        qq.insert(200);
        qq.insert(300);
        qq.insert(400);
        
        System.out.println(qq.isFull());
    }
}