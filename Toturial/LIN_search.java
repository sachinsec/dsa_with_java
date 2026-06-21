public class LIN_search {
    public static void main(String[] args) {
        int[] nums = {23,35,1,3,28,9,38,4,2,8,7};
        int target =8;
        int ans = linearSearch(nums, target);
        System.out.println(ans);

        
    }

    static int linearSearch(int[] arr,int target){
        if(arr.length==0){
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            if(element == target){
                return i;
            }
        }

        //this line will execute if none of the return statements above have executed 
        //hence the target not found
        return -1;

    }
    }
