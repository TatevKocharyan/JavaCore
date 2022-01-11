package chapter14.twotypegen;

public class TwoGen <T,V>{
    T ob1;
    V ob2;

    TwoGen(T o1,V o2){
       ob1= o1;
       ob2=o2;
    }

    void showTypes(){
        System.out.println("the type of T is "+ob1.getClass().getName());
        System.out.println("the type of V is "+ob2.getClass().getName());
    }

    public T getOb1() {
        return ob1;
    }

    public V getOb2() {
        return ob2;
    }
}
