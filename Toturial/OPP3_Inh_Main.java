import com.pkg.*;
public class OPP3_Inh_Main extends OPP3_Inheritance{

    double weight;
    public OPP3_Inh_Main(){
        this.weight = -1;
    }
    public OPP3_Inh_Main(double l, double h, double w, double weight){
        super(l,h,w); // What is this ? call the parent class constructor
        //used to initialise value present in parent class
        super(l, h, weight );
        this.weight = weight;
        
    }
    
}
