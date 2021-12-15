package chapter10;

public class SuperSubCatch {
    public static void main(String[] args) {
        try {
            int a=0;
            int b=42/a;
        }catch (Exception e){
            System.out.println("Generic exception catch");
            System.out.println(e);
        }//catch (ArithmeticException e){
           // System.out.println("Never reached");
        //}
        System.out.println("after catch statement is executed");

    }
}
