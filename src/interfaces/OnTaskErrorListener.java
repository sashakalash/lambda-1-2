package interfaces;

@FunctionalInterface
public interface OnTaskErrorListener {
    void onError(Exception err);
}