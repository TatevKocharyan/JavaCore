package chapter6;

public class BoxDemo {
    public static void main(String[] args) {
        //
        Box myBox = new Box();
        Box myBox1 = new Box();


        myBox.depth = 10;
        myBox.height = 20;
        myBox.width = 5;
        System.out.println(myBox.volume());

        //


        myBox1.width = 500;
        myBox1.depth = 40;
        myBox1.height = 7;


    }
}
