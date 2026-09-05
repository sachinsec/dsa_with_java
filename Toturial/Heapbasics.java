import java.util.PriorityQueue;

public class Heapbasics {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(10);
        pq.add(20);
        pq.add(5);
        pq.add(40);
        // System.out.println(pq);
        // System.out.println(pq.size());
        // System.out.println(pq.peek());
        // System.out.println(pq.remove());
        // System.out.println(pq.peek());

        for (Integer integer : pq) {
            System.out.print(integer+" ");
        }
    }
}
