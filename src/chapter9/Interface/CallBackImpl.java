package chapter9.Interface;

public class CallBackImpl implements CallBack {
    @Override
    public void callback() {
        System.out.println("from impl 1");
    }

    @Override
    public void method1() {
        System.out.println("override default method");
    }
}
