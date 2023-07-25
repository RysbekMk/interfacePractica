public class Bear extends Predator{
    public Bear(int mass) {
        super(mass);
    }

    @Override
    public void hunt() {
        System.out.println("Bear is big hunter");
    }

    @Override
    void eat() {
        System.out.println("Bear eat fish");
    }

    @Override
    void run() {
        System.out.println("Bear running nospeed");
    }
}
