package chapter14.extendsformofGenBoundedTypes;

public class BoundsDemo {
    public static void main(String[] args) {


        Integer inums[]={12,45,87,548,654};
        States<Integer> iOb=new States<>(inums);
        double w=iOb.average();
        System.out.println("the average of array inum is "+w);
    }
}
