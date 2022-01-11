package chapter14.genericinterface;

public class GenIfDemo {
    public static void main(String[] args) {
        Integer inums[]={3,6,4,8,7};
        Character chr[]={'a','d','f','h'};


        MyClass<Integer> iob=new MyClass<>(inums);
        MyClass<Character> cob=new MyClass<>(chr);

        int hashCode = cob.hashCode();
        System.out.println(hashCode);
        System.out.println(iob.max());
        System.out.println(iob.min());
        System.out.println(cob.max());
        System.out.println(cob.min());


    }


}
