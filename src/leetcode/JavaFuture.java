package leetcode;

import java.util.concurrent.Callable;

public class JavaFuture implements Callable<String>{

    @Override
    public String call() throws Exception {
        Thread.sleep(100000000);
        return Thread.currentThread().getName();
    }

    
}
