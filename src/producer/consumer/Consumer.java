package producer.consumer;

import java.util.concurrent.BlockingQueue;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Consumer implements Runnable {

    private final BlockingQueue sharedQueue;
    
    public Consumer(BlockingQueue sharedQueue) {
        this.sharedQueue = sharedQueue;
    }
    
    @Override
    public void run() {
        while(true){
            try {
                System.out.println("Consumer: " + sharedQueue.take());
            } catch (InterruptedException e) {
                Logger.getLogger(Consumer.class.getName()).log(Level.SEVERE, null, e);
            }
        }
    }
}
