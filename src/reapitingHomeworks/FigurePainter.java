package reapitingHomeworks;

public class FigurePainter {
    public static void main(String[] args) {

        //1

        for (int i = 0; i <= 4; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" * ");

            }
            System.out.println();

        }
//2
        for (int i = 4; i > 0; i--) {

            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            for (int j = 5; j > i; j--) {
                System.out.print("*");
            }
            System.out.println();

        }

        //3

        for (int i = 0; i < 4; i++) {
            System.out.println();
            for (int j = 4; j > i; j--) {
                System.out.print("* ");
            }
        }
        System.out.println();
//4
        for (int i = 0; i < 4; i++) {

            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 4; j > i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

//5
        for (int i = 0; i <= 4; i++) {
            for (int j = 4; j > i; j--) {
                System.out.print(" ");
            }

            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }


            for (int j = 3; j > i; j--) {
                System.out.print(" *");
            }System.out.println();



        }
    }


}


