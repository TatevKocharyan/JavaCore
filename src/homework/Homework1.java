package homework;

public class Homework1 {
    public static void main(String[] args) {
        for (int i = 0; i < 2; i++) {
            System.out.println();
            System.out.print(" * ");
        }

        for (int j = 2; j > 1; j--) {

            System.out.println(" * ");

        }
        for (int k = 1; k > 0; k--) {

            System.out.print(" * ");
            {
                for (int i = 3; i > 1; i--) {
                    System.out.print(" * ");
                }
                for (int i = 1; i >0 ; i--) {
                    System.out.println();
                    System.out.print(" * ");
                }
                for (int i = 4; i > 1 ; i--) {
                    System.out.print(" * ");
                }
            }
        }


    }
}


