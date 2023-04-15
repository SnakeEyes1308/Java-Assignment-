package Assignment_6;

public class MallardDuck extends Duck{


    public MallardDuck(){
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
        swim = new CanSwim();
    }


    @Override
    public void display() {
        System.out.println("I am Mallard Duck");
    }
}
