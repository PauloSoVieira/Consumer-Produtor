public class Consumer implements Runnable {

    int platesConsumed;
    private Restaurant restaurant;

    public Consumer(Restaurant restaurant, int platesConsumed) {
        this.restaurant = restaurant;
        this.platesConsumed = platesConsumed;
    }

    @Override
    public void run() {


        int i = 0;
        while (i != platesConsumed) {
            synchronized (restaurant) {

                String test = restaurant.consumePlate();
                if (test != null) {
                    System.out.println("Client eat : " + test);

                    i++;
                }

            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }


    }


    public void start() {

        Thread thread = new Thread(this);
        thread.start();

    }
}
