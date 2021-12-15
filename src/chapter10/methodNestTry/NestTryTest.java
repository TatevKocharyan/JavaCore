package chapter10.methodNestTry;

public class NestTryTest {
    public static void main(String[] args) throws IllegalAccessException {
        try {
            int a = args.length;
            int b = 42 / a;
            System.out.println("a=" + a);
            MethNestTry.nesttry(a);
        } catch (ArithmeticException e) {
            System.out.println("Divide by Zero " + e);
        }

// trying "throw" keyword
        throw new IllegalAccessException("demo");


    }
}
