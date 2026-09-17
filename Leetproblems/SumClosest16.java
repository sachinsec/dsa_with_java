public class SumClosest16 {
    public static void main(String[] args) {
        int [] arr = {0,1,2};
        int t = 3;
        
        System.out.println(threeSumClosest(arr,t));
    }

    static int threeSumClosest(int[] nums, int target) {
        int size = nums.length-1;

        if (size<target) {
            return  target;
        }
        if (nums[size]==target) {
            return (nums[size-1]+nums[size]);
        }

        if (nums[0]==target) {
            return (nums[0]+nums[1]);
        }

        return nums[target-1] + nums[target] + nums[target+1];
    }
}
