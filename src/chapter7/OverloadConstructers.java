package chapter7;

public class OverloadConstructers {
    public static void main(String[] args) {
        Box mybox=new Box(10,20,50);
        Box mybox1=new Box();
        Box mycube=new Box(2);
        Box myclone=new Box(mybox);
        double vol;
        System.out.println(vol = mybox.vol());
        System.out.println(mybox1.vol());
        System.out.println(mycube.vol());
        System.out.println(myclone.vol());

    }
}
