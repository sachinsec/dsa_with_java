
public class OPP2_StaticBlock {
    static int a = 4;
    static int b ;

    // will only run once, when the first obj is create i.e. when the class is loaded for the first time
    static{
        System.out.println("I am in static block");
        b = a * 5;
    }
    public static void main(String[] args) {
        OPP2_StaticBlock obj = new OPP2_StaticBlock();
        System.out.println(OPP2_StaticBlock.a + " " + OPP2_StaticBlock.b);

        OPP2_StaticBlock.b += 3;

        System.out.println(OPP2_StaticBlock.a + " " + OPP2_StaticBlock.b);

        OPP2_StaticBlock obj2 = new OPP2_StaticBlock();
        System.out.println(OPP2_StaticBlock.a + " " + OPP2_StaticBlock.b);
    }
}
