public class Producer {
    Thread thread2 = new Thread(() -> {


        synchronized (Resource2) {
            System.out.println("Thread 2: Locked Resource 2");

            try {
                Thread.sleep(100); // Simulate some work (and give time for Thread 1 to lock Resource 1)
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }

            synchronized (Resource1) {
                System.out.println("Thread 2: Locked Resource 1");
            }
        }
    });
}
