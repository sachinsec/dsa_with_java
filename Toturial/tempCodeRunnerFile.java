import java.util.Arrays;

/**
 * Practice
 */
public class Practice {
    public static void main(String[] args) {

        int [][] arr = {
        {1, 2, 3},
        {4, 5, 6,7},
        {8, 9, 10}
    };
    //System.out.println(arr.length);
    System.out.println(Arrays.toString(search(arr, 7)));
        
    }

    static int[] search(int [][] arr,int target){
        int r = arr.length-1;
        int c = 0;

         for (int i = 0; i < arr.length; i++) {
            if(arr[r][c] == target){
             return new int[]{r,c};
         }
           else if(target > arr[r][c]){
               c = linbin(arr[r],target);
                if(c ==-1){
                    return new int[]{-1,-1};
                }
                 

            } else if(target < arr[r][c]){
                r--;
            }
         }
         return new int[]{-1,-1};

    }

    static int linbin(int [] arr,int target){
        int s = 0;
        int l = arr.length-1;
        
        for (int i = 0; i < arr.length; i++) {
            int mid = (s+l)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(arr[mid]>target){
                l = mid-1;
            }else if(arr[mid]<target){
                s = mid+1;
            }
        }
        return -1;
    }
}