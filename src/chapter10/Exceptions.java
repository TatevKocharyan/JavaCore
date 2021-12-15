package chapter10;

public class Exceptions {
    public static void main(String[] args) {
       try {
           int d=0;
           int a= 45/d;
           System.out.println("this will not be printed");
       } catch (ArithmeticException e) {
           System.out.println("divide by another number");
       }
        System.out.println("lets try again");




       try {
           int [] a=new int[-10];
       }catch (Exception e){
           System.out.println("0");
       }

    }
}
