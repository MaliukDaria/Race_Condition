import org.apache.log4j.Logger;

public class CountThread extends Thread {
    private static final Logger logger = Logger.getLogger(CountThread.class);
    private Counter counter;

    public CountThread(Counter counter) {
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
