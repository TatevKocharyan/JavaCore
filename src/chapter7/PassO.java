package chapter7;

public class PassO {
    public static void main(String[] args) {
        Test ob1 = new Test(10, 40);
        Test ob2 = new Test(10, 40);
        Test ob3 = new Test(2, 4);
        Test ob4 = new Test(4, 8);

        System.out.println("ob1=ob2" + ob1.equalTo(ob2));
        System.out.println("ob1=ob3" + ob1.equalTo(ob3));
        System.out.println(ob4.equalTo(ob3));

        Box mybox1 = new Box(10, 20, 15);
        Box mybox = new Box();
        Box mycube = new Box(7);
        Box myclone = new Box(mybox1);

        System.out.println(mybox1.vol());
        System.out.println(mybox.vol());
        System.out.println(mycube.vol());
        System.out.println(myclone.vol());
    }
}
