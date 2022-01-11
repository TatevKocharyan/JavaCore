package chapter14.wildcardargument;

public class StatsDemo {
    public static void main(String[] args) {
        Integer [] nums={1,4,54,54,21,};
        Double [] nums1={21.2,54.6,78.5,65.5};
        Stats <Integer> ob1=new Stats<>(nums);
        Stats<Double>ob2=new Stats<>(nums1);
        System.out.println(ob1.average());
        System.out.println(ob2.average());
        System.out.println(ob1.sameAvg(ob2));


    }
}
