import java.util.Arrays;

public class Fun_ChangeValue {

    public static void main(String[] args) {
        int [] arr= {1,6,8,5,3};
       Change(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void Change(int[] nums){
        nums[0] =99;
    }
}