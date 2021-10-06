package homework;

public class stars2 {
    public static void main(String[] args) {
        for (int i = 4; i > 0; i--) {
                System.out.println("");
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 5; j > i; j--) {
                System.out.print("*");
            }
        }
    }
}
