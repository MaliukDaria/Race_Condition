public class MainApp {

    public static void main(String[] args) {
        CountThread firstThread = new CountThread();
        CountThread secondThread = new CountThread();
        firstThread.start();
        secondThread.start();
    }
}
