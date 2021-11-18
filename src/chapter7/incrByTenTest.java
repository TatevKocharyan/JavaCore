package chapter7;

public class incrByTenTest {
    public static void main(String[] args) {
        IncrByTen ob1=new IncrByTen(2);
        IncrByTen ob2;
        ob2=ob1.inBy10();
        System.out.println(ob1.a);
        System.out.println(ob2.a);
        ob2=ob2.inBy10();
        System.out.println(ob2.a);
    }
}
