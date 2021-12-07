package chapter8;

public class ABDemo {
    public static void main(String[] args) {
        A a = new A();
        a.showij();
        a.setIJ(5, 6);
        System.out.println(a.i);
        System.out.println(a.j);
        B b=new B();
        b.showij();
        b.setIJ(7,8);
        System.out.println(b.i);
        System.out.println(b.j);
        b.showij();

        a=b;
a=null;

    }
}
