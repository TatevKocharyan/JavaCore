package chapter2;

public class Example3 {
public static void main(String[] args) {
    int x, y;
    x = 10;
    y = 20;
    if (x < y)
    { System.out.println("x is less than y");}

    x = x * 2;
    if (x == y)
    {System.out.println("x is equal to y");}
    x = x * 2;
    if (x > y)
    {System.out.println("x is more than y");}
    if (x == y)
    {System.out.println("x is equal y");}

    int a;
    a = 5;
    System.out.println("a=" + a);
    a = a * 2;
    System.out.print("a=");
    System.out.println(a);

    int b;
    b = 30;
    if (a<b) {System.out.println("a is less than b");}
    if (a==b) {System.out.println("a is  not equal to b");}
    a=30;
    if (a==b) {System.out.println("a is equal to b" );}
    a=a+5;
    System.out.println("a is " +a);
    if(a==40) {
        System.out.println("equation is true");
    } else { System.out.println("equation is false");
    }
}}
