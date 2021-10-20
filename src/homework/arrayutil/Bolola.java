package homework.arrayutil;

public class Bolola {
    public static void main(String[] args) {
        char[] bolola = {'b', 'o', 'l', 'o', 'l', 'a'};
        //Task 1
        int count = 0;
        for (int i = 0; i < bolola.length; i++) {
            char c = bolola[i];
            if (c == 'o') {
                count++;
            }

        }
        System.out.println("count = " + count);


        //Task 2
        System.out.println(bolola[bolola.length / 2 - 1]);
        System.out.println(bolola[bolola.length / 2]);


        //Task 3
        boolean isFound = true;
        for (int i = 0; i < bolola.length; i++) {
            if (bolola[bolola.length - 1] == 'y') {
                isFound=false;

            }else if (bolola[bolola.length - 2] == 'l') {
                isFound=true;
            }

        }System.out.println(isFound);



    }

}



