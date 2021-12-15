package chapter9.Interface;

import chapter9.Interface.CallBack;

public class CallBackTest {
    public static void main(String[] args) {
        System.out.println(CallBack.EXIT);
        CallBack.method2();
        CallBackImpl callBack=new CallBackImpl();
        callBack.callback();
        callBack.method1();





    }

}
