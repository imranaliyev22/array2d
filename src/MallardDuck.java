public class MallardDuck extends Duck implements Flyable, Quackable,Reproducing {
    @Override
    public void display() {
        System.out.println("I am a Mallard Duck");
    }

    @Override
    public void fly() {
        System.out.println("Mallard Duck flying!");

    }

    @Override
    public void quack() {
        System.out.println("Mallard Duck quacking!");

    }

    @Override
    public void reproductive() {
        System.out.println("Mallard Duck reproducing!");
    }
}

