import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    private static final Object lock = new Object();
    protected int limit = 10;
    private int limitOfPlates;
    private ArrayList<String> plates;


    public Restaurant(int limitOfPlates) {
        this.limitOfPlates = limitOfPlates;
        plates = new ArrayList<>();
    }

    public void addPlates(String item) {

        synchronized (lock) {
            if (plates.size() < limit) {
                plates.add(item);
                System.out.println("New dish added " + item);
                //   System.out.println(this.getPlates().size());

            }
        }


    }

    public String consumePlate() {

        synchronized (lock) {
            if (!plates.isEmpty()) {
                String name = plates.removeFirst();
                return name;

            }
            //System.out.println("empty");
        }
        return null;

    }

    public List getPlates() {
        System.out.println(plates);

        return plates;
    }
}