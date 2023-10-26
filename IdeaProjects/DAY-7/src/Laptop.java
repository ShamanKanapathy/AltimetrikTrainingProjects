public class Laptop extends Thread {

    public void run() {
        //"synchronized" Executes threads one by one according to the priority level
        // by locking the other threads which is not running.

        for (int i = 0; i < 5; i++) {
            synchronized (this) {
                System.out.println(Thread.currentThread().getName() + ":" + i);
                if (i % 2 == 0) {
                    try {
                        Thread.sleep(1000);
                        System.out.println(isInterrupted());
                    } catch (InterruptedException e) {
                        System.out.println(isInterrupted());
                    }
                }
            }

            System.out.println(Thread.currentThread().getState());

        }
            Laptop lp = new Laptop();
            System.out.println(lp.getState());
            lp.start();
            lp.isAlive();
            lp.isInterrupted();
            System.out.println(lp.getState());

        }
    }

