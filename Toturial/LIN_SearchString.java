public class LIN_SearchString {
    public static void main(String[] args) {
        String name = "Sachin";
        char target = 'u';
       System.out.println(LinearSearch(name, target)); 

    }

    static boolean LinearSearch (String name , char target){
        if (name.length()==0) {
            return false;
        }

        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i)==target) {
                return true;
            }
        }
        return false;
    }
}
