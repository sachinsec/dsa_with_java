public class ARR_Max {
    public static void main(String[] args) {
        int[] arr= {1,3,23,98,18};
        System.out.println(max(arr));

        //For the finding specific range

        System.out.println(MaxRange(arr,1,2));
    }
    //imagine that arr is not empty

    static int max(int[] arr){
        int temp = arr[0];
        for (int i = 0; i < arr.length; i++) {

                if (arr[i]>temp) {
                    temp = arr[i];
            }
        }

        return temp;
    }

    //Other Method for the range

    static int MaxRange(int[] arr,int start,int end){

        int temp = arr[start];
        for (int i = 0; i <= end; i++) {
            if (arr[i]>temp) {
                temp=arr[i];
            }
        }
        
        return temp;

    }
}
