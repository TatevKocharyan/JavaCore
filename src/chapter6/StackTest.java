package chapter6;

public class StackTest {
    public static void main(String[] args) {
        Stack mystack1 = new Stack();
        mystack1.push(45);
        mystack1.push(55);
        mystack1.push(65);
        Stack mystack2 = new Stack(20);

        System.out.println(mystack1.pop());


    }
}
