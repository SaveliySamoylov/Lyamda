import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Safe implements Lockable {
    private int code;
    private Lock lock = new ReentrantLock();

    public Safe(int code) {
        this.code = code;
    }

    @Override
    public void lock() {
        lock.lock();
        System.out.println("Safe locked");
    }

    public int getCode() {
        return code;
    }
}

