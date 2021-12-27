package chapter13;

import java.io.File;
import java.io.IOException;

public class FileExample {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\on-off\\Desktop\\JAVA\\Example.txt";
        File file = new File(path);
        File newfile = new File("C:\\Users\\on-off\\Desktop\\JAVA\\asdf1.txt");
        file.renameTo(newfile);



/*
        File [] files= file.listFiles();
        for (File singleFile : files){
        String name=singleFile.getName();
        if (name.contains(".")){
           String [] split= name.split("\\.");
            System.out.println(split[split.length-1]);
        }}




        System.out.println(file.isFile());
        System.out.println(file.exists());
        if (!file.exists()) {
            file.mkdir();
        }
        System.out.println(file.exists());

        System.out.println(file.canWrite());
        System.out.println(file.canRead());
        System.out.println(file.canExecute());





      if (file.exists()){
           file.delete();
       } System.out.println(file.exists());





        if (!file.exists()){
           if (file.createNewFile()){
               System.out.println("file is created");
           }
       }
        System.out.println(file.exists());






       {
            System.out.println(singleFile.getName()+"       "+singleFile.length()+"              "+singleFile.getAbsolutePath());

        }*/
    }
}
