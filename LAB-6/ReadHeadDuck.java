package Assignment_6;

public class ReadHeadDuck extends Duck{

    public ReadHeadDuck(){
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
        swim = new CanSwim();
    }




    @Override
    public void display() {
        System.out.println("I am a Read Head Duck");
    }
}
