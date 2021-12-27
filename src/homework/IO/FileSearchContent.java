package homework.IO;

import java.io.*;
import java.util.Scanner;

public class FileSearchContent {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        System.out.println("Please input  path of the directory");
        String path = scanner.nextLine();
        File directorypath = new File(path);
        if (!directorypath.exists() || directorypath.isFile()) {
            System.err.println("file does not exists or is file");
        } else {
            System.out.println("Pleas input keyword");
            String keyword = scanner.nextLine();
            findeFile(directorypath, keyword);
        }



    }


    static void findeFile(File parent, String keyword) {
        for (File file : parent.listFiles()) {
            if (file.isDirectory()) {
                findeFile(file, keyword);
            } else {
                if (file.getName().endsWith(".txt")) {
                    searchKeyword(file,keyword);
            }
        }


    }


}

    private static void searchKeyword(File file, String keyword) {
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
          String s;
          int linenumber=1;
          while((s=br.readLine())!=null){
              if (s.contains(keyword)){
              System.out.println(file.getAbsolutePath()+ ("\nlinenumber")+ (linenumber));
              break;
              } linenumber++;
          }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
















}
