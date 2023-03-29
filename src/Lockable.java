import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public interface Lockable {
    void lock();
}

class House implements Lockable {
    private String address;
    private Lock lock = new ReentrantLock();

    public House(String address) {
        this.address = address;
    }

    @Override
    public void lock() {
        lock.lock();
        System.out.println("House locked");
    }

    public String getAddress() {
        return address;
    }
}
