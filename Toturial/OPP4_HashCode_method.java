class A{
    public int hashCode(){
        return super.hashCode();
    }
    public boolean equals(A obj){
        return super.equals(obj);
    }
    @Override
    public A clone() throws CloneNotSupportedException{
        return (A) super.clone();
    }
}
public class OPP4_HashCode_method {
    public static void main(String[] args) {
        A obj = new A();
        A obj1 = new A();
        System.out.println(obj.hashCode());
        System.out.println(obj1.hashCode());
        System.out.println(obj1 instanceof A); 
    }
}
