public class STR_Palin {
    public static void main(String[] args) {
        String str = "";
        System.out.println(isPalindrom(str));
        
    }
    static boolean isPalindrom(String str){
        str = str.toLowerCase();
        for (int i = 0; i < str.length()/2; i++) {
            char start = str.charAt(i);
            char end = str.charAt(str.length() - 1 -i);

            if(start != end){
                return false;
            }
            else if (str.length() == 0 || str == null) {
                return true;
            }
        }
        return true;

    }
}
