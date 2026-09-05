import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.concurrent.PriorityBlockingQueue;

public class Heapgreak {
    public static void main(String[] args) {
        
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int k = 4;
        int[] arr = {1,2,3,6,5,8,9,10};
        for (int ele : arr) {
            pq.add(ele);
            if (pq.size()>k) pq.remove();
        }
        System.out.println(pq.peek());
    }
}
