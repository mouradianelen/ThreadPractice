package ProducerConsumer;

import java.util.Random;
import java.util.concurrent.BlockingQueue;

public class Consumer extends Thread{
    private final QueueStorage<String> buffer;

    public Consumer(QueueStorage<String> buffer) {
        this.buffer = buffer;
    }


    @Override
    public void run() {
        while (true){
            if (buffer.isEmpty()){
                continue;
            }
            if (buffer.get().equals(Main.EOF)){
                System.out.println(Thread.currentThread().getName()+" exiting.");
                break;
            } else {
                System.out.println(Thread.currentThread().getName()+ " removed " +buffer.remove());
            }
        }

    }
}
