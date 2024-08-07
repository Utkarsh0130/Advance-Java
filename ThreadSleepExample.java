// This program demonstrates the use of the sleep method in Java

class MySleepThread extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread: " + i);
            try {
                Thread.sleep(1000); // Sleep for 1000 milliseconds (1 second)
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class ThreadSleepExample {
    public static void main(String[] args) {
        MySleepThread thread = new MySleepThread();
        thread.start(); // Start the thread
    }
}
