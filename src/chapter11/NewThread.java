package chapter11;

public class NewThread implements Runnable{
    Thread t ;

    public NewThread() {
       t=new Thread(this,"Demo Thread");
        System.out.println("Childe Thread"+t);
        //t.start();
    }



    @Override
    public void run() {
        for (int i = 5; i >0 ; i--) {
            System.out.println("Childe thread"+i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Childe interrupted");
            }
            System.out.println("Exiting childe thread");
        }
    }
}
