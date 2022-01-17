package homework.threads;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class ThreadForRead implements Runnable {
    String path;
    List<String> lines;
    String keyword;
    Thread t;

    ThreadForRead(String path, List<String> lines, String keyword) {
        this.lines=lines;
        this.path = path;
        this.keyword = keyword;
        t = new Thread(this);
        t.start();

    }

    @Override
    public void run() {
        AtomicInteger atomicInteger=new AtomicInteger();
        for (String line : lines) {
            if (line.contains(keyword)){
                MultithreadRead.countOfKeywords.incrementAndGet();
            }
        }

    }
}




