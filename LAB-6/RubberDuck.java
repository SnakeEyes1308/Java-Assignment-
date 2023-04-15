package Assignment_6;

public class RubberDuck extends Duck{

    public RubberDuck(){
        quackBehavior = new Squeak();
        flyBehavior = new FlyNoWay();
        swim = new Float();
    }

    @Override
    public void display() {
        System.out.println("I am a Rubber Duck");
    }
}
