// This program demonstrates the difference between using Runnable interface and extending Thread class in Java

// Using Runnable interface
class RunnableTask implements Runnable {
    @Override
    public void run() {
        System.out.println("Runnable task is running.");
    }
}

// Extending Thread class
class ThreadTask extends Thread {
    @Override
    public void run() {
        System.out.println("Thread task is running.");
    }
}

public class RunnableVsThreadExample {
    public static void main(String[] args) {
        // Using Runnable interface
        Thread runnableThread = new Thread(new RunnableTask());
        runnableThread.start();

        // Extending Thread class
        ThreadTask threadTask = new ThreadTask();
        threadTask.start();
    }
}
