package Concurrent;

    public class MyThread extends Thread {
        @Override
        public void run() {
            Service service = new Service();
            service.service1();
        }

        public static void main(String[] args) {
            MyThread t=new MyThread();
            t.start();
        }
    }

