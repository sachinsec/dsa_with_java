import java.io.File;
import java.io.FileWriter;

public  class pratice {

    public static void main(String[] args) throws Exception{
        File newfile = new File("first");
       
        // try {
        //     newfile.createNewFile();
        // } catch (Exception e) {
        //     System.out.println(e);
        // }

        // FileWriter filewrite  = new FileWriter("first.txt");
        // filewrite.write("Hello students what you are doing here\nMy name is Sachin");
        // filewrite.close();
        newfile.isHidden();
        
        
    }
}