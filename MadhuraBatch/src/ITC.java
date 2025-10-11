class SharedResource {
    private int data;
    private boolean hasData = false;

    // Producer adds data
    public synchronized void produce(int value) {
        while (hasData) {
            try {
                wait(); // wait until data is consumed
            } catch (InterruptedException t) {
                System.out.println(t);
            }
        }
        data = value;
        System.out.println("Produced :: " + data);
        hasData = true;
        notify(); // Notify consumer
    }

    // Consumer uses data
    public synchronized void consume() {
        while (!hasData) {
            try {
                wait(); // wait until data is produced
            } catch (InterruptedException r) {
                System.out.println(r);
            }
        }
        System.out.println("Consumed :: " + data);
        hasData = false;
        notify(); // Notify producer
    }
}

class Producer extends Thread {
    private SharedResource resource;

    Producer(SharedResource resource) {
        this.resource = resource;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            resource.produce(i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException t) {}
        }
    }
}

class Consumer extends Thread {
    private SharedResource resource;

    Consumer(SharedResource resource) {
        this.resource = resource;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            resource.consume(); // ✅ removed argument
            try {
                Thread.sleep(500);
            } catch (InterruptedException t) {}
        }
    }
}

public class ITC {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();
        Producer p = new Producer(resource);
        Consumer c = new Consumer(resource);

        p.start(); // ✅ Start producer thread
        c.start(); // ✅ Start consumer thread
    }
}
