abstract class Parent{
    static int age = 23;
    final int VALUE = 265;
    abstract void career();
    abstract void Partner();

}
class Child extends Parent{
    @Override
    void career(){
        System.out.println("I am going to be a doctor.");
    }
    @Override
    void Partner(){
        System.out.println("I love Pepper Potts");
    }
}
class Daughter extends Parent{
    @Override
    void career(){
        System.out.println("I am going to be a coder");
    }
    void Partner(){
        System.out.println(" I love Pepper potts");
    }
}


public class OPP5_Abstract {
    public static void main(String[] args) {
        Child child = new Child();
        child.career();
        Daughter daughter = new Daughter();
        daughter.career();
    }
}
