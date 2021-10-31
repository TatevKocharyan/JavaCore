package homework.classes;

public class FigurePainter {
    // Method 1
    void figurePainter1(int n, char symbol) {
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" " + symbol + " ");

            }
            System.out.println();

        }
    }


    //Method 2

    void figurePainter2(int n, char symbol) {
        for (int i = n; i > 0; i--) {

            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            for (int j = 5; j > i; j--) {
                System.out.print(symbol + " ");
            }
            System.out.println();
        }
    }

    //Method 3
    void figurePainter3(int n, char symbol) {
        int i;
        for (i = 0; i < n; i++) {
            System.out.println();
            for (int j = 4; j > i; j--) {
                System.out.print(" " + symbol + " ");
            }
        }

    }

    //Mrthod 4
    void figurePainter4( char symbol) {
        int i1;
        for (i1 = 0; i1 <= 3; i1++) {
            for (int j = 0; j < i1; j++) {
                System.out.print("  ");
            }
            for (int j = 4; j > i1; j--) {
                System.out.print(" "+symbol);
            }
            System.out.println();
        }
    }

   // Method 5
   void figurePainter5(){

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










