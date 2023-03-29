class LambdaLockable {
    public static void main(String[] args) {
        Lockable house = new House("123 Main St.");
        house.lock();

        Lockable safe = new Safe(1234);
        safe.lock();

        Lockable computer = new Computer("Windows");
        computer.lock();

        Lockable lambdaLockable = () -> System.out.println("Lambda locked");
        lambdaLockable.lock();
    }
}
