package homework.threads;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class MultithreadRead {

    public static String path = "C:\\Users\\on-off\\Desktop\\JAVA\\sample.txt";
    public static AtomicInteger countOfKeywords = new AtomicInteger();


    public static void main(String[] args) throws IOException, InterruptedException {
        long count = Files.lines(Paths.get(path)).count();
        List<String> lines=Files.readAllLines(Paths.get(path));
        String keyword=";";
        System.out.println("All lines"+count);
        long currentTime=System.currentTimeMillis();

        ThreadForRead threadForRead = new ThreadForRead("C:\\Users\\on-off\\Desktop\\JAVA\\sample.txt",lines.subList(0,50000),";" );
        ThreadForRead threadForRead1 = new ThreadForRead("C:\\Users\\on-off\\Desktop\\JAVA\\sample.txt", lines.subList(50001, lines.size()), ";");

        threadForRead.t.join();
        threadForRead1.t.join();

        System.out.println("found lines"+countOfKeywords);
        long finishedTime=System.currentTimeMillis();
        System.out.println(finishedTime-currentTime);



    }
}
