package chapter8;

public class B extends A {
    String a="dfdf";
    int k;
    void showk(){
        System.out.println("k:"+k);
    }

    void sum(){
        System.out.println("i+j+k="+(i+j+k));
    }

    @Override
    void showij() {
        super.showij();
        System.out.println("i and j are oerridden  ");
    }
}



