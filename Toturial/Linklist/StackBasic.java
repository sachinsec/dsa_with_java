import java.util.Stack;

public class StackBasic {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(263);
        s.push(223);
        s.push(273);
        s.push(234);
        s.push(253);

        System.out.println(s.lastElement());
        s.remove(2);
        System.out.println();
    }
}
