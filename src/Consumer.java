public class Consumer {

    private String Resource1 = " Prato diario";


    Thread thread1 = new Thread(() -> {
        synchronized (Resource1) {

            try {
                eat();
                Thread.sleep(100); // Simulate some work (and give time for Thread 2 to lock Resource 2)
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }


        }
    });
}
