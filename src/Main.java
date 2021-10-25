import interfaces.OnTaskDoneListener;
import interfaces.OnTaskErrorListener;

public class Main {

    public static void main(String[] args) {
        OnTaskDoneListener listener = System.out::println;
        OnTaskErrorListener errorCallback = System.err::println;

        Worker worker = new Worker(listener, errorCallback);
        worker.start();
    }
}