public class Main {
    public static void main(String[] args) {
        Volf volf = new Volf(87);
        volf.eat();
        volf.run();
        volf.hunt();

        Bear bear = new Bear(178);
        bear.eat();
        bear.hunt();
        bear.run();

        Lion lion = new Lion(90);
        lion.eat();
        lion.hunt();
        lion.run();
    }
}