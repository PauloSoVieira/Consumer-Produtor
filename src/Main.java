public class Main {
    public static void main(String[] args) {
        public class DeadlockExample {

            // Two resource objects
            private static final Object Resource1 = new Object();
            private static final Object Resource2 = new Object();

            public static void main(String[] args) {
                // Thread 1 tries to lock Resource1 then Resource2


                // Thread 2 tries to lock Resource2 then Resource1


                thread1.start();
                thread2.start();
            }
        }

    }
}