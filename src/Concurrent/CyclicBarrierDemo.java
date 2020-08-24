package Concurrent;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierDemo {
    public static void main(String[] args) {

        // 召唤龙珠的线程
        CyclicBarrier cycliBarrier = new CyclicBarrier(7, () -> {
            System.out.println("召唤成功");
        });

        for (int i = 1; i <= 7; i++) {
            final int temp = i;
            // lambada 能操作到i 吗？  不能
            // 变量的作用域问题
            new Thread(()->{
                System.out.println(Thread.currentThread().getName()+"收集了"+temp+"龙珠");
                try {
                    cycliBarrier.await(); // 等待
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (BrokenBarrierException e) {
                    e.printStackTrace();
                }
            }).start();
        }
    }
}