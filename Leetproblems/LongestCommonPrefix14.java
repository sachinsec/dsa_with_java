public class LongestCommonPrefix14 {
    public static void main(String[] args) {
        String [] strs = {"slower","flow","glight"};

        longestCommonPrefix(strs);

    }

    static  void longestCommonPrefix(String[] strs) {
        int count = 0;
        char st=' ';
        int i = 1;
        boolean run = true;
        
        while(run){
            String s = strs[i-1];
            char ch = s.charAt(0);
            System.out.println(ch);

            String s1 = strs[i];
            char ch1 = s1.charAt(0);
            System.out.println(ch1);

            String s2= strs[i+1];
            char ch2 = s2.charAt(0);
            System.out.println(ch2);

             if (ch==ch1 &&ch1==ch2 &&ch2==ch) {
                st = ch;
                run = true;
                 count++;
             }else{
             run = false;
                 break;
             }
             i++;
            
        }
       
      //  System.out.println(count);
    }
}
