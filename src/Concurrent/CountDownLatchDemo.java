package Concurrent;

import java.util.concurrent.CountDownLatch;

// 减法计算器
public class CountDownLatchDemo {
    public static void main(String[] args) throws InterruptedException {
        // 总数是6
        CountDownLatch countDownLatch = new CountDownLatch(6);

        for (int i = 0; i < 6; i++) {
            new Thread(()->{
                System.out.println(Thread.currentThread().getName()+"Go out");
                countDownLatch.countDown();
            },String.valueOf(i)).start();
        }

        // 保证上面计数器都变为0，才会唤醒
        countDownLatch.await(); // 等待计算器归零，然后再向下执行

        System.out.println("Close door");
    }
}