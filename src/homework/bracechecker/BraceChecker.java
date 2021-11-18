package homework.bracechecker;

public class BraceChecker {

    //սա հենց տեքստն է
    private String text;

    //կլասսի կոնստրուկտորն է, որը պետք է ընդունի String տիպի տեքստ, և վերագրի վերևի տեքստին
    //Որ չկարողանանք BraceChecker-ի օբյեկտը սարքենք առանց text-տալու կոնստրուկտորի միջոցով․
    public BraceChecker(String text) {
        this.text = text;

    }

    //սա հիմնական մեթոդն է, որի մեջ գրելու ենք ամբողջ լոգիկան․ աշխատելու ենք թե stack-ի հետ, թե վերևի text-ի
    public void check() {

        Stack stackforChecker = new Stack();

        boolean isVaid = true;
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            switch (c) {
                case '(':
                case '{':
                case '[':
                    stackforChecker.push(c);
                    break;
                case ')':
                    int pop = stackforChecker.pop();
                    if (pop != '(') {
                        isVaid = false;
                        System.out.println("Error: closed" + c + "but opened" + (char) pop + "at" + i);
                    }
                    break;
                case '}':
                    pop = stackforChecker.pop();
                    if (pop != '{') {
                        isVaid = false;
                        System.out.println("Error: closed" + c + "but opened" + (char) pop + "at" + i);
                    }
                    break;
                case ']':
                    pop = stackforChecker.pop();
                    if (pop != '[') {
                        isVaid = false;
                        System.out.println("Error: closed" + c + "but opened" + (char) pop + "at" + i);
                    }
                    break;
            }
        }if (isVaid) ;
        {System.out.println("Everything is Right");}

    }
}














