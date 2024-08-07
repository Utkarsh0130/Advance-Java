// This program demonstrates setting thread priority in Java

class MyPriorityThread extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " with priority " + Thread.currentThread().getPriority() + ": " + i);
            try {
                Thread.sleep(500); // Sleep for 500 milliseconds
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class ThreadPriorityExample {
    public static void main(String[] args) {
        MyPriorityThread t1 = new MyPriorityThread();
        MyPriorityThread t2 = new MyPriorityThread();
        MyPriorityThread t3 = new MyPriorityThread();

        t1.setPriority(Thread.MIN_PRIORITY); // Setting priority of thread 1 to minimum
        t2.setPriority(Thread.NORM_PRIORITY); // Setting priority of thread 2 to normal
        t3.setPriority(Thread.MAX_PRIORITY); // Setting priority of thread 3 to maximum

        t1.start(); // Start thread 1
        t2.start(); // Start thread 2
        t3.start(); // Start thread 3
    }
}
