import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

/**
 * QueqeBasics
 */
public class QueqeBasics {

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        Queue<Integer> dq = new ArrayDeque<>();

        q.add(10);
        q.add(20);
        q.add(30);

        System.out.println(q);

        dq.add(10);
        dq.add(10);
        dq.remove();
    }
}