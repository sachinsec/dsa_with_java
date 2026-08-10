import java.util.*;
// It is same as a arraylist but internally difference 
public class LL_Simple {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(23);
        list.add(33);
        list.add(93);
        list.add(29);
        list.addLast(00);
        list.addFirst(142);
        System.out.println(list.getFirst());
    }
}
