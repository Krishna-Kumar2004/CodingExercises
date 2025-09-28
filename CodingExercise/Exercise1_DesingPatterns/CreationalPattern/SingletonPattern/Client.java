package SingletonPattern;

public class Client {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        logger1.log("First log message");
        logger2.log("Second log message");

        // Both references point to the same object
        System.out.println("Are logger1 and logger2 the same? " + (logger1 == logger2));
    }
}
