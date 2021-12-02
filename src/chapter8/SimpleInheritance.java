package chapter8;

public class SimpleInheritance {
    public static void main(String[] args) {
        A superOb=new A();
        B subOb=new B();
        superOb.i=10;
       superOb.j=20;
        superOb.showij();
        subOb.sum();
        System.out.println();
        subOb.i=5;
       subOb.j=4;
        subOb.k=8;
        subOb.showij();
        subOb.showk();
        subOb.sum();



    }
}
