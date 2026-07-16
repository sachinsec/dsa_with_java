/**
 * OPP3_Polymorphism
 * 
 * Polymorphism is two type (1.) Method overloading  (2.) Method override 
 */
class Shapes{
    //final keyword prevent form overridden.
   static void area(){
        System.out.println("I am in shapes.");
    }
}
class Triangle extends Shapes{
    // This will run when obje of Circle is created.
    //hence it is overriding the parent method.

    @Override // this is called annotation.
    void area(){
        System.out.println("I am in Triangle.");

    }
}
class Circle extends Shapes{
    
    void area(){
        System.out.println("I am in Circle");

    }

}
class Square extends Shapes{
    void area(){
        System.out.println("I am in Square");

    }

}

public class OPP3_Polymorphism {

    public static void main(String[] args) {
        Shapes shape = new Shapes();
        Circle circle = new Circle();
        Square square = new Square();
        Shapes obj = new Circle(); // This is known as upcasting.
        circle.area();

    }
}