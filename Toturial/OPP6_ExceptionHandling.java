public class OPP6_ExceptionHandling {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        try{
            divide(a, b);
        } catch(ArithmeticException e){
            System.out.println(e.getMessage());
        } finally{
            System.out.println("This will always execute");
        }
    }
    static int divide(int a, int b) throws ArithmeticException{

        if (b == 0) {
            throw new ArithmeticException("Please, Do no divide by zero.");
        }
        return a / b;
    }
}
