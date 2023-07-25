public class Volf extends Predator {
    public Volf(int mass) {
        super(mass);
    }

    @Override
    public void hunt() {
        System.out.println("Volf one is the hunter in the world");
    }

    @Override
    void eat() {
        System.out.println("Volf eat meat");
    }

    @Override
    void run() {
        System.out.println("Volf run with family");
    }
}
