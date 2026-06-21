public class Practice {

    public static void main(String[] args) {
        int [] arr = {2,3,5,9};
        int target = 8;

       int [] ans = Solution(arr,target);
       System.out.println(ans);
    }

    static int[] Solution(int [] arr, int target){

        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i]+arr[i+1]== target) {
                return new int[]{i,i+1};
            }
        }

        return new int[]{-1,-1};
    }
}