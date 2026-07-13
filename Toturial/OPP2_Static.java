import com.pkg.OPP2_Human;
public class OPP2_Static{
    public static void main(String [] args){
        OPP2_Human kunal = new OPP2_Human(22,"Kunal",10000,false);
        OPP2_Human rahul = new OPP2_Human(34,"Rahul",60000,true);

        System.out.println(kunal.name);
        System.out.println(rahul.married);
    }
}