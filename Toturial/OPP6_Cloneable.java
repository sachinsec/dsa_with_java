interface Cloneable{
    //void Human(int age, String name);

}

class Human implements Cloneable{
    int age;
    String name;
    
    Human(int age, String name){
        this.age  = age;
        this.name = name;

    }
    
    public Human(Human other){
        this.age = other.age;
        this.name = other.name;
    }

    public Object clone() throws CloneNotSupportedException{

        return super.clone();
    }
        }


public class OPP6_Cloneable {
    public static void main(String[] args) {
        Human kunal = new Human(23,"kunal");
        Human twin = new Human(kunal);
        System.out.println(twin.age);
    }
}
