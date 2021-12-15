package chapter9.mypack;

public class AccountBalance {
    public static void main(String[] args) {
        Balance current [] =new Balance[3];
        current[0]=new Balance("K.J. Fielding",123.23);
        current[1]=new Balance("Will Tell",154.45);
        current[2]=new Balance("Tom Jackson",-45.12);
        for (int i = 0; i <3 ; i++) {
            current[i].show();
            
        }
    }
}
