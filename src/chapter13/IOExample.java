package chapter13;

import java.io.*;

public class IOExample {


    private static final String FILE_PATH = "C:\\Users\\on-off\\Desktop\\JAVA\\asdf.txt";


    public static void main(String[] args) throws IOException {
        write();
        read();

     //   File file =new File(FILE_PATH);
     //   file.delete();
     //   System.out.println(file.exists());

    }


    private static void write() throws IOException {

        DataOutputStream out = new DataOutputStream(new FileOutputStream(FILE_PATH));
        out.write(20);
        out.writeBoolean(false);
        out.close();
    }


    private static void read() throws IOException {
        DataInputStream in=new DataInputStream(new FileInputStream(FILE_PATH));
        System.out.println(in.read());
        System.out.println(in.readBoolean());
        in.close();

    }


}
