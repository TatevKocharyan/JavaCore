package homework.IO;

import java.io.*;

public class FileUtil {
    public void findLines(String txtPath, String keyword) {
        try (BufferedReader br = new BufferedReader(new FileReader(txtPath))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (line.contains(keyword)) {
                    System.out.println(line);
                }
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void printSizeOfPackage(String path) {
        File file=new File(path);
        File []files= file.listFiles();
            int sum = 0;
            for (int i = 0; i < files.length; i++) {
                if (files[i].length() > sum) ;
                sum += files[i].length();
            }
        System.out.println(sum);;

        }

    public void createFileWithContent(String path1, String filename1, String content) {
        File file = new File(filename1);
        if (!file.exists()) {
            try {
                file.createNewFile();
                BufferedWriter bw = new BufferedWriter(new FileWriter(file));
                bw.write(content);
                bw.close();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
