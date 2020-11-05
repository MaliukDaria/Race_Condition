public class MainApp {

    public static void main(String[] args) {
        Counter counter = new Counter();
        Thread firstThread = new CountThread(counter);
        Thread secondThread = new Thread(new CountRunnable(counter));
        firstThread.start();
        secondThread.start();
    }
}
