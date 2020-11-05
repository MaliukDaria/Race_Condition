import org.apache.log4j.Logger;

public class CountRunnable implements Runnable {
    private static final Logger logger = Logger.getLogger(CountRunnable.class);

    @Override
    public void run() {
        Counter counter = new Counter();
        while (counter.getCount() <= Counter.MAX_NUMBER) {
            counter.incrementCounter();
            logger.info(Thread.currentThread().getName() + " value " + counter.getCount());
        }
    }
}
