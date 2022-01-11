package chapter14.twotypegen;

public class SimpGen {
    public static void main(String[] args) {
        TwoGen<Integer,String> intStr;
        intStr=new TwoGen<>(45,"hello");
        intStr.showTypes();

        System.out.println(intStr.getOb1());
        System.out.println(intStr.getOb2());

    }
}
