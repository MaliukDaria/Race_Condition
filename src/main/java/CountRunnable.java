import org.apache.log4j.Logger;

public class CountRunnable implements Runnable {
    private static final Logger logger = Logger.getLogger(CountRunnable.class);
    private Counter counter;

    public CountRunnable(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        while (counter.getCount() <= Counter.MAX_NUMBER) {
            counter.incrementCounter();
            logger.info(Thread.currentThread().getName() + " value " + counter.getCount());
        }
    }
}
