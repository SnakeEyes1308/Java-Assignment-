package Assignment_6;

public class DecoyDuck extends Duck{

    public  DecoyDuck(){
        flyBehavior = new FlyNoWay();
        quackBehavior = new MuteQuack();
        swim = new Drown();
    }

    @Override
    public void display() {
        System.out.println("I am decoy duck");
    }
}
