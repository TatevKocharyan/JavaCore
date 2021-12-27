package homework.IO;

import java.io.File;
import java.util.Scanner;

public class FileUtilTest {
    static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        FileUtil fileUtil = new FileUtil();


       System.out.println("Please input \".txt\" file path ");
       String filename = scanner.nextLine();
       System.out.println("Please input a word for printing the line ");
       String word = scanner.nextLine();
       fileUtil.findLines(filename, word);


        System.out.println("Please input package for getting its' Megabytes");
        String path = scanner.nextLine();
        fileUtil.printSizeOfPackage(path);


       System.out.println("Please input Directory path");
       String path1 = scanner.nextLine();
       System.out.println("Please input filenaem");
       String filename1 = scanner.nextLine();
       System.out.println("Please input the text you want to write in the file");
       String content = scanner.nextLine();
       fileUtil.createFileWithContent(path1, filename1, content);


    }
}
