package homework;

public class FigurePainter {
    public static void main(String[] args) {



        // First
        for (int i = 0; i <= 4; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" * ");

            }
            System.out.println();

        }





        // Second
        for (int i = 4; i > 0; i--) {

            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            for (int j = 5; j > i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }

        //Third
        int i;
        for (i = 0; i < 5; i++) {
            System.out.println();
            for (int j = 4; j > i; j--) {
                System.out.print(" * ");

            }
        }

        //Fourth
        int i1;
        for (i1 = 0; i1 <=3; i1++) {
            for (int j = 0; j < i1; j++) {
                System.out.print("  ");
            }
            for (int j = 4; j >i1; j--) {
                System.out.print(" *");
            }System.out.println();
        }

        //Fifth
        for (int i2 =0; i2 <=3; i2++) {
            for (int j =3; j >=i2; j--) {
                System.out.print(" ");

            }
            for (int j =0; j <= i2; j++) {
                System.out.print("* ");

            } System.out.println();

        }
        for (int i2 = 0; i2<=4; i2++) {
            for (int j = 0; j < i2; j++) {
                System.out.print(" ");
            }System.out.print(" ");

            for (int j = 3; j > i2; j--) {
                System.out.print(" *");
            }System.out.println();
        }


    }


        }









