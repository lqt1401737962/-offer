package day22_异常线程同步;

public class NoScoreException extends RuntimeException {

    public NoScoreException() {
        super();
    }

    public NoScoreException(String message) {
        super(message);
    }
}
