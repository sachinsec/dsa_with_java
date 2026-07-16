/**
 * OPP5_SeprateClass
 */

interface media{
    void stop();
    void start();
}
interface music extends media{
 void skip();
 void previous();
}
class CDPlayer implements music{

    public void stop(){
        System.out.println(" music stop");
            }
    public void start(){
        System.out.println("Music start");
    }
    public void skip(){

        System.out.println("Skip");
    }
    public void previous(){
System.out.println("Previous");
    }
}
public class OPP5_SeprateClass {
    public static void main(String[] args) {
         CDPlayer ms = new CDPlayer();

    ms.skip();
    ms.previous();
    }
}