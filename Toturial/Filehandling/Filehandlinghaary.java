import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Filehandlinghaary{
    public static void main(String[] args)throws Exception{

    //  File myfile = new File("newfile.txt");

    //  try {
    //      myfile.createNewFile();
    //  } catch (Exception e) {
    //     System.out.println("Unable to create thsi file.");
    //     e.printStackTrace();
    //  }
    
    // except of try catch we also use throw and throws exception like I am using writer 
     // Write functions
    // FileWriter filewriter = new FileWriter("newfile.txt");
    // filewriter.write("This is our first file from this java course.\n Okay, now bye");
    // filewriter.close();

    // Read function of the file 
    //  File myfile = new File("hello.txt");
    //  Scanner sc =  new Scanner(myfile);
    //  while (sc.hasNextLine()) {
    //     String line = sc.nextLine();
    //     System.out.println(line);
    //  }

    File myfile = new File("hello.txt");
    if (myfile.delete()) {
        System.out.println("I have deleted "+ myfile.getName());
    }
    else{
        System.out.println("Some error occured while deleting the file");
    }

    }
}