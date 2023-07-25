public class Lion extends Predator{
    public Lion(int mass) {
        super(mass);
    }

    @Override
    public void hunt() {
        System.out.println("Lion king of the jungle");
    }

    @Override
    void eat() {
        System.out.println("Lion eat meat");
    }

    @Override
    void run() {
        System.out.println("Lion runnin whith he family");
    }
}
