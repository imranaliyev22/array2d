public class RubberDuck extends Duck implements Quackable {
    @Override
    public void display() {
        System.out.println("I am a Rubber Duck");
    }

    @Override
    public void quack() {
        System.out.println("Rubber Duck quacking!");
    }
}
