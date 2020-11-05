public class Counter {
    public static final int MAX_NUMBER = 100;
    private static int count = 0;

    public int getCount() {
        return count;
    }

    public void incrementCounter() {
        count++;
    }
}
