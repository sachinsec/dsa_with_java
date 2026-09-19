import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;

public class Practice {
    public static void main(String[] args) {
        int[] arr = {23,58,89852,99,8382,984,8943};
        PriorityQueue<Integer> h = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < arr.length; i++) {
            h.add(arr[i]);
        }
        System.out.println(h.poll());
        h.remove(8943);
        System.out.println(h.peek());
        System.out.println(h.contains(23));
    }
    
}