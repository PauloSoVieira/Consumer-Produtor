public class Main extends Thread {
    public static void main(String[] args) {

        Restaurant restaurant = new Restaurant(5);

        // restaurant.addPlates("Bacalhau");


        Cozinheiro cozinheiro = new Cozinheiro(restaurant);
        Cozinheiro cozinheiro2 = new Cozinheiro(restaurant);
        Consumer consumer = new Consumer(restaurant, 6);

        cozinheiro.start();
        cozinheiro2.start();

        consumer.start();

        // System.out.println("teste " + restaurant.getPlates());

        //  System.out.println(restaurant.getPlates().size());

    }
}



