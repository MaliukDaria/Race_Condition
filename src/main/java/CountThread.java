import org.apache.log4j.Logger;

public class CountThread extends Thread {
    private static final Logger logger = Logger.getLogger(CountThread.class);

    @Override
    public void run() {
        Counter counter = new Counter();
        while (counter.getCount() <= Counter.MAX_NUMBER) {
            counter.incrementCounter();
            logger.info(currentThread().getName() + " value " + counter.getCount());
        }
    }
}
