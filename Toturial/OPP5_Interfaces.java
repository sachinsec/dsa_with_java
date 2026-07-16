interface Parent{
    static final int price = 78000;
    void start();
    void stop();
    void acc();
}

interface Brake{
    void brake();
}
interface Engine{
    void start();
    void stop();
}
class Car implements Brake, Engine{

    public void brake(){

        System.out.println("Brake");
    }
    public void stop(){
        System.out.println("Stop");

    }
    public void start(){

        System.out.println("start");
    }
}

public class OPP5_Interfaces {
    public static void main(String[] args) {
        Car car = new Car();
        car.brake();
        car.start();
        car.stop();
    }
}
