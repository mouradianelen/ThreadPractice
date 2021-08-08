package ProducerConsumer;

import java.util.Random;
import java.util.concurrent.BlockingQueue;

public class Producer extends Thread {
    private final QueueStorage<String > buffer;

    public Producer(QueueStorage<String> buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        String numbers[] = {"1","2","3"};
        for (String number : numbers){
            buffer.add(number);
            System.out.println(Thread.currentThread().getName()+" added "+number);
        }
        System.out.println(Thread.currentThread().getName()+" added "+Main.EOF);
        buffer.add(Main.EOF);
    }
    }

