package homework.bracechecker;

public class BraceCheckerTest {

    public static void main(String[] args) {
        String text = "{Hello from) Java)";
        BraceChecker braceChecker = new BraceChecker(text);

        braceChecker.check();
       // System.out.println();
        //System.out.println("Error: opened [ but closed } at 20");
    }

}
