package homework.classes;

public class Bolola {
    //Global variable
    char[] bolola = {'b', 'o', 'l', 'o', 'l', 'y'};


    // Method 1
    void setBolola(char[] bolola) {
        char c = 'o';
        int count = 0;
        for (int i = 0; i < bolola.length; i++) {
            if (bolola[i] == c) {
                count++;
            }


        }
        System.out.println(count);
    }


    //Method 2
    void HalfOfLength(char[] bolola) {
        System.out.println(bolola[bolola.length / 2]);
        System.out.println(bolola[bolola.length / 2 - 1]);
    }


    //Method 3
    void bolola(char[] bolola) {
        boolean isFoud = false;
        for (int i = 0; i < bolola.length; i++) {


            if (bolola[bolola.length - 1] == 'y' &&
                    bolola[bolola.length - 2] == 'l') {
                isFoud = true;

            }
        }
        System.out.println(isFoud);
    }

    //Method 4
    void setBob(char[] bolola) {
        boolean bob = false;
        for (int i = 0; i < bolola.length - 2; i++) {
            if (bolola[i] == 'b' &&
                    bolola[i + 2] == 'b') {
                bob = true;
            }

        }
        System.out.println(bob);
    }


    //Global Variable
    char[] text = {' ', ' ', 'b', 'a', 'r', 'e', 'v', ' ', ' ', ' '};


    //Method 5
    void barev(char[] text) {


        int starstindex = 0;
        int endindex = text.length - 1;

        while (starstindex < endindex && text[starstindex] == ' ') {
            starstindex++;
        }
        while (endindex > starstindex && text[endindex] == ' ') {
            endindex--;
        }

        char[] result = new char[(endindex - starstindex) + 1];
        int index = 0;
        for (int i = starstindex; i <= endindex; i++) {
            result[index++] = text[i];
        }


        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
        }
    }


}
