public class LIN_FindMin {
    public static void main(String[] args) {
        int[]arr={3,82,89,9,3,5,2,4,35,34};
        System.out.println(Min(arr));
        
    }

    static int Min(int[]arr){
        int temp = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(temp > arr[i]){
                temp = arr[i];
            }
        }
        return temp;
    }
}
