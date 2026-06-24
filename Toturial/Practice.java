public class Practice {
    public static void main(String[] args) {
        int [] arr = {-2,-5,8,9,10,11,23,45,68,98,99};
        int target = -5;

        Find(arr,target);
    }

    static void Find(int[] arr,int target){
        int ans = -1;
        int start=0,end=arr.length-1;

        if (arr[0]==target) {
            ans = 0;
        }
        else{
            ans = 1;
        }

        for (; start <= end; start++) {
           int mid = start + (end - start)/2;
            if (target==arr[mid]) {
                ans = mid;
            }
            else if(target > arr[mid]){
                start = mid + 1;
            }
            else{
                end = mid -1;
            }
        }
        System.out.println(ans);
    }
}
