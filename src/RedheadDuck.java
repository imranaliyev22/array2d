public class RedheadDuck extends Duck implements Flyable, Quackable ,Reproducing {
    @Override
    public void display() {
        System.out.println("I am a Redhead Duck");
    }

    @Override
    public void fly() {
        System.out.println("Redhead Duck flying!");
    }

    @Override
    public void quack() {
        System.out.println("Redhead Duck quacking!");
    }

    @Override
    public void reproductive() {
        System.out.println("Redhead Duck reproductive");
    }
}
