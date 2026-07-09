import java.util.ArrayList;

public class RECU_AR_Returnarraylist {
    public static void main(String[] args) {
        int [] arr = {2, 3, 1, 4, 4, 5};
        System.out.println(findAllIndex(arr, 4, 0));
    }
    
    //static ArrayList<Integer> list = new ArrayList<>();
    static ArrayList<Integer> findAllIndex(int [] arr, int target, int index){
        ArrayList<Integer> list = new ArrayList<>();
        if (index == arr.length) {
            return list;
        }
        
        //This will contain answer for that function call only
        if (arr[index] == target) {
            list.add(index);
        }
        ArrayList<Integer> ansFromBelowCalls = findAllIndex(arr, target, index + 1);
    
        list.addAll(ansFromBelowCalls);
        return list;
    }
}
