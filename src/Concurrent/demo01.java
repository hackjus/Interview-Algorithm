package Concurrent;

// Executors 工具类 ：三大方法
// 使用线程池之后是使用线程池来创建线程

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class demo01 {
    public static void main(String[] args) {
//        ExecutorService threadPool = Executors.newSingleThreadExecutor();// 单个线程
//        ExecutorService threadPool = Executors.newCachedThreadPool();// 可伸缩的
        ExecutorService threadPool = Executors.newFixedThreadPool(5);// 创建一个固定的线程池


        try {
            for (int i = 0; i < 10; i++) {
                // 使用了线程池之后，使用线程池来创建对象
                threadPool.execute(()->{
                    System.out.println(Thread.currentThread().getName()+"线程");
                });
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // 线程池用完，程序结束，关闭线程池
            threadPool.shutdown();
        }
    }
}