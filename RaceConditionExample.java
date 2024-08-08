// This program demonstrates a race condition in Java

class Counter {
    private int count = 0;

    public void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}

class CounterTask extends Thread {
    private Counter counter;

    public CounterTask(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter.increment();
        }
    }
}

public class RaceConditionExample {
    public static void main(String[] args) {
        Counter counter = new Counter();

        // Creating multiple threads that access the same Counter object
        CounterTask task1 = new CounterTask(counter);
        CounterTask task2 = new CounterTask(counter);
        CounterTask task3 = new CounterTask(counter);

        task1.start();
        task2.start();
        task3.start();

        // Waiting for threads to finish
        try {
            task1.join();
            task2.join();
            task3.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        // The final count might not be 3000 due to race condition
        System.out.println("Final count: " + counter.getCount());
    }
}
