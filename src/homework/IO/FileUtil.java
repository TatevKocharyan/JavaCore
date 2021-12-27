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
        int file = path.length();
        System.out.println(file);
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
