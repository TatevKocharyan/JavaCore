package homework.IO;

import java.io.File;
import java.util.Scanner;

public class FileSearchClass {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        System.out.println("Please input  path of the directory");
        String path = scanner.nextLine();
        File directorypath = new File(path);
        if (!directorypath.exists() || directorypath.isFile()) {
            System.err.println("file does not exists or is file");
        } else {
            System.out.println("Pleas input name of the file");
            String filename = scanner.nextLine();
            findeFile(directorypath, filename);
        }


    }


    static void findeFile(File parent, String fileName) {
        for (File file : parent.listFiles()) {
            if (file.isDirectory()) {
                findeFile(file, fileName);
            } else {
                if (file.getName().contains(fileName)) {
                    System.out.println(file.getAbsolutePath());
                }
            }
        }


    }


}
