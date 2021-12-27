package chapter13;

import java.io.*;

public class FileReadAndWrite    {


    private static final String FILE_PATH ="C:\\Users\\on-off\\IdeaProjects\\JavaCore\\src\\chapter13\\file\\Example1.txt";

    public static void main(String[] args)  throws IOException{
        write();
        read();
    }



    private static void write() {
        try (BufferedWriter bw=new BufferedWriter(new FileWriter(FILE_PATH))){
            bw.write("Hello from JAva");
           // bw.write("\r\n");
            bw.write("HElo from Java 2");
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    private static void read() {
        try
            (BufferedReader br=new BufferedReader(new FileReader(FILE_PATH))){
          // String line="";
         //  while ((line=br.readLine())!=null){
          //     System.out.println(line);


            int c;
            while ((c=br.read())!=-1){
                System.out.print((char) c+" ");
           }




        } catch (IOException e) {
            e.printStackTrace();
        }

    }



}
