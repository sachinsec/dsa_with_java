import java.util.ArrayList;

/**
 * OPP4_AccessControl
 */

class A{
    private int num =4 ;
    public String name = "Kunal";
    protected String nams= " rahul";
    protected int [] arr;

    public int getNum(){
        return num;
    }
    public void setName(String name){
        this.name = name;
    }
}

public class OPP4_AccessControl {
public static void main(String[] args) {
    // ArrayList<Integer> list = new ArrayList<>();
    A obj = new A();
    obj.nams="Sachin";
    System.out.println(obj.nams);
}
    
}