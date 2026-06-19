import java.util.Arrays;

public class Fun_Overloading {
    public static void main(String[] args) {
       demo(2,3,5,3,4);
       demo("Sachin","arjun","mohit","Krishnveer");
        
    }
   static void demo(int ...v){
        System.out.println(Arrays.toString(v));
    }
   static void demo(String ...v){
        System.out.println(Arrays.toString(v));
    }
}
