/*
package Concurrent;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

public class CallableAndFuture {
    public static void main(String[] args) {
        Callable callable = new Callable() {
            public Integer call() throws Exception {
                return new Random().nextInt(100);
            }
        };
        FutureTask future = new FutureTask();
        new Thread(future).start();
        try {
            Thread.sleep(5000);// 可能做一些事情
            System.out.println(future.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}*/
