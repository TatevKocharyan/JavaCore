package homework.arrayutil;

public class Bolola {
    public static void main(String[] args) {
        /*   1)
    Ունենք հետևյալ մասիվը՝
char[] bolola = {'b','o','l','o','l','a'};
ունենք նաև մի սինվոլ՝ char c = 'o';
Պետք է գրել լոգիկա, որը կհաշվի թե քանի հատ կա c-փոփոխականից մեր մասիվի մեջ, ու տպել այդ քանակը։*/


        char[] bolola = {'b', 'o', 'l', 'o', 'l', 'y'};
        char c = 'o';
        int count = 0;
        for (int i = 0; i < bolola.length; i++) {
            if (bolola[i] == c) {
                count++;
            }


        }
        System.out.println(count);

/*   2)
    Ունենք հետևյալ մասիվը՝
char[] bolola = {'b','o','l','o','l','a'};
պետք է գրել կոդ, որը կտպի մեջտեղի 2 սինվոլները։*/


        System.out.println(bolola[bolola.length / 2]);
        System.out.println(bolola[bolola.length / 2 - 1]);


/*   3)
    Ունենք հետևյալ մասիվը՝՝
char[] bolola = {'b','o','l','o','l','a'};
պետք է տպենք true եթե մեր մասիվը վերջանում է ly-ով, եթե ոչ՝ false */

        boolean isFoud = false;
        for (int i = 0; i < bolola.length; i++) {


            if (bolola[bolola.length - 1] == 'y' &&
                    bolola[bolola.length - 2] == 'l') {
                isFoud = true;

            }
        }
        System.out.println(isFoud);


/*4)
    Ունենք հետևյալ մասիվը՝
char[] bolola = {'b','a',b','o','l','a'};
//Տպում ենք true եթե տեքստը պարունակում է bob բառը, բայց o-ի տեղը կարող է լինել ցանկացած սինվոլ։
//օր․ abcbob → true, b9b -> true, բայց ասենք bac-> false*/

        boolean bob = false;
        for (int i = 0; i < bolola.length - 2; i++) {
            if (bolola[i] == 'b' &&
                    bolola[i + 2] == 'b') {
                bob = true;
            }

        }
        System.out.println(bob);
/* 5)
    Ունենք հետևյալ մասիվը՝
char[] text = {' ',' ','b','a','r','e','v',' ',' '};
Տվյալ օրինակում կարող ենք կամայական քանակի պռաբելներ դնել թե սկզբից թե վերջից չկենտրոնանաք,
                որ երկու հատ է դրված։ Պետք է գրել կոդ, որը text մասիվից կստանա char[] result մասիվ,
                որը կլինի նույն տեքստը, առանց պռաբելների(իրար կողք կտպի barev)։*/

        char[] text = {' ', ' ', 'b', 'a', 'r','e','v' ,' ','A', 'r','m','e','n','i','a', ' ', ' ',' '};

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
        for (int i = starstindex; i<= endindex; i++){
            result[index++] = text[i];
        }


        for (int i = 0; i < result.length ; i++) {
            System.out.print(result[i]);
        }

    }
}








