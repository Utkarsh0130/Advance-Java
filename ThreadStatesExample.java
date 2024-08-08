// This program demonstrates different thread states in Java

class MyThread extends Thread {
    @Override
    public void run() {
        try {
            System.out.println("Thread state: " + Thread.currentThread().getState()); // RUNNABLE
            Thread.sleep(1000); // TIMED_WAITING
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println("Thread state after sleep: " + Thread.currentThread().getState()); // RUNNABLE or TERMINATED
    }
}

public class ThreadStatesExample {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        
        System.out.println("Thread state after creation: " + thread.getState()); // NEW
        thread.start();
        System.out.println("Thread state after start: " + thread.getState()); // RUNNABLE

        // Main thread waits to ensure child thread transitions through different states
        try {
            thread.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        
        System.out.println("Thread state after completion: " + thread.getState()); // TERMINATED
    }
}
