import java.util.Arrays;
public class Fun_Varargs {
    public static void main(String[] args) {
        fun(2,6,54,6,5,6,5,6,5,8,8,7,8,9,4,5,6,1,2,3);
    }
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));

    }
}
