import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Computer implements Lockable {
    private String os;
    private Lock lock = new ReentrantLock();

    public Computer(String os) {
        this.os = os;
    }

    @Override
    public void lock() {
        lock.lock();
        System.out.println("Computer locked");
    }

    public String getOs() {
        return os;
    }
}
