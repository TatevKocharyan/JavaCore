package chapter9;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {
    public static void main(String[] args) {
        SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
        Date date =new Date();
        System.out.println(date);
        System.out.println(sdf.format(date));
    }
}
