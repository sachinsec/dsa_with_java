/*
two type of stream in java --> 1 byte steam 2. charcater stream
byte stream has two part inpute stream and output stream
charcter stream has two type :- 1. reader 2. writer
*/

import java.io.IOException;
import java.io.InputStreamReader;

public class filehandlingbasic {
    public static void main(String[] args) {
        
    try(InputStreamReader isr = new InputStreamReader(System.in)){
        System.out.println("Enter some letters");
        int letters = isr.read();
        while (isr.ready()) {
            System.out.println((char)letters);
            letters = isr.read();

        }
        isr.close();
        System.out.println();
    }catch(IOException e){
        System.out.println(e);
    }

    }
}
