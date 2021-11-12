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
        char c = text.charAt(0);
        Stack stackforChecker = new Stack();
        for (int i = 0; i < text.length(); i++) {
            c = text.charAt(i);
            switch (c) {
                case '(':
                case '{':
                case '[':
                    stackforChecker.push(c);
                    break;
                case ')':
                    stackforChecker.pop();
                    if (stackforChecker.pop()!='(')
                    break;
                case '}':
                    stackforChecker.pop();
                    if (stackforChecker.pop()!='{')
                        System.out.println("Error");
                    break;
                case ']':
                    stackforChecker.pop();
                    if (stackforChecker.pop()!='[')
                        System.out.println("Error");
                    break;
                default:



                    // case '[':
                    // stackforChecker.push(c);
                    //  break;


                    //if (c!=')'){
                    //  stackforChecker.pop();}


                    //       stackforChecker.pop();
                    //  System.out.println("true");
                    // break;
                    // case '{':
                    //    System.out.println(false);
                    //     break;
                    //  case '[':
                    //      System.out.println(false);
                    //      break;
                    //   case '}':
                    //     System.out.println(false);
                    //      break;
                    //   case ']':
                    //     System.out.println(false);
                    //    break;

            }
        }
    }
}

//  text.charAt(i)=='{'||
// text.charAt(i)=='[')
// System.out.print(text.charAt(i)+" ");
//StackforChecker.push(text.charAt(i));









