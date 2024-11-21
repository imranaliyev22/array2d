public class DuckTest {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.display();
        ((Flyable) mallard).fly();
        ((Quackable) mallard).quack();
        ((Reproducing) mallard).reproductive();

        Duck redhead = new RedheadDuck();
        redhead.display();
        ((Flyable) redhead).fly();
        ((Quackable) redhead).quack();
        ((Reproducing) redhead).reproductive();

        Duck rubber = new RubberDuck();
        rubber.display();
        ((Quackable) rubber).quack();

        Duck decoy = new DecoyDuck();
        decoy.display();

    }
}
