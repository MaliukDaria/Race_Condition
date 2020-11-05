public class MainApp {

    public static void main(String[] args) {
        Thread firstThread = new CountThread();
        Thread secondThread = new Thread(new CountRunnable());
        firstThread.start();
        secondThread.start();
    }
}
