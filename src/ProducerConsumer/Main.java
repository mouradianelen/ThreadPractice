package ProducerConsumer;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Main {
    public static final String EOF = "EOF";

    public static void main(String[] args) {
        QueueStorage<String> buffer = new QueueStorage<>();

        Thread producerThread = new Thread(new Producer(buffer));
        producerThread.setName("producerThread");

        Thread consumerThread1 = new Thread(new Consumer(buffer));
        consumerThread1.setName("consumerThread1");

        Thread consumerThread2 = new Thread(new Consumer(buffer));
        consumerThread2.setName("consumerThread2");

        producerThread.start();
        consumerThread1.start();
        consumerThread2.start();

    }
}
