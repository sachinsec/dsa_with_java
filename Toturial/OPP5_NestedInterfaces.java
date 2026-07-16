class A{

    public interface NestedInter{
        boolean isOdd(int num);
    }
}
class B implements A.NestedInter{
    @Override
    public boolean isOdd(int num){
        return (num & 1) == 1;
    }
}

public class OPP5_NestedInterfaces {
    public static void main(String[] args) {

        B obj = new B();
        System.out.println(obj.isOdd(8));
        
    }
}
