package producer.consumer;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Access {

    public static void main(String[] args) {

        BlockingQueue<String> sharedQueue = new LinkedBlockingQueue<>();
        
        Thread producerThread = new Thread(new Producer(sharedQueue));
        Thread consumerThread = new Thread(new Consumer(sharedQueue));
        
        producerThread.start();
        consumerThread.start();
        
    }
}
