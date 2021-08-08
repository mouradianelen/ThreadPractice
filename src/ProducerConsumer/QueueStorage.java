package ProducerConsumer;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.BlockingQueue;

public class QueueStorage<T> {

    private Queue<T> queue = new ArrayDeque();
//    private int maxSize;

//    public QueueStorage(int maxSize){
//        this.maxSize=maxSize;
//    }

    public T get(){

        return queue.peek();
    }
    public T remove(){
        return queue.remove();
    }

    public void add(T element) {
        queue.add(element);
    }
    public int getSize() {
        return queue.size();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }




}
