import java.util.Random;

public class Cozinheiro implements Runnable {

    String[] dish = {"bacalhau", "peru com batata", "Peixe frito", "Salada"};
    Random random = new Random();
    private Restaurant restaurant;
    private int platesCooked;

    public Cozinheiro(Restaurant restaurant) {
        this.restaurant = restaurant;
        this.platesCooked = platesCooked;
    }

    public String getDish() {
        return dish[random.nextInt(dish.length)];
    }

    @Override
    public void run() {

        while (true) {

            try {
                Thread.sleep(100); // Simulate some work (and give time for Thread 1 to lock Resource 1)
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }

            synchronized (restaurant) {

                if (restaurant.getPlates().size() <= restaurant.limit) {

                    restaurant.addPlates(getDish());
                }
            }

        }


    }


    public void start() {
        Thread thread = new Thread(this);
        thread.start();
    }
}
