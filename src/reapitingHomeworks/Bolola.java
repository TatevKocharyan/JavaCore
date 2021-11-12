package reapitingHomeworks;

public class Bolola {
    public static void main(String[] args) {
        char[] bolola = {'b', 'o', 'l', 'o', 'l', 'a'};


        int count = 0;
        char c = 'o';
        for (int i = 0; i < bolola.length; i++) {
            if (bolola[i] == c)
                count++;


        }
        System.out.println(count);


        System.out.println(bolola[bolola.length / 2]);
        System.out.println(bolola[bolola.length / 2 - 1]);

        boolean a = false;
        for (int i = 0; i < bolola.length; i++) {
            if (bolola[bolola.length - 1] == 'y' && bolola[bolola.length - 2] == 'l')
                a = true;

        }
        System.out.println(a);


        boolean bob = false;
        char[] bolola1 = {'b', 'a', 'b', 'o', 'b', 'a'};
        for (int i = bolola1.length - 1; i > 0; i--) {
            if (bolola1[i] == 'b' && bolola1[i - 2] == 'b')
                bob = true;

        }
        System.out.println(bob);

        char[] text = {' ', ' ', 'b', 'a', ' ',' ',' ',' ', 'r', 'e', 'v', ' ', ' '};
        for (int i = 0; i < text.length; i++) {
            if (text[i] != ' ')
                System.out.print(text[i]);
        }


        int startpoint = 0;
        int endpoint = text.length - 1;

        while (startpoint<endpoint && text[startpoint]==' ');
        startpoint++;

        while (endpoint>startpoint && text[endpoint]==' ');
        endpoint--;


        char [] result =new char[(endpoint-startpoint)+1];
        int index=0;
        for (int i = startpoint; i <=endpoint; i++) {
            result[index++]=text[i];

            }
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
        }

    }



