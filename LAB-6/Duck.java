package Assignment_6;

abstract public class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;
    Swim swim;

//    public abstract void swim();
    public abstract void display();

    public void performQuack(){
        quackBehavior.quack();
    }

    public void performFly(){
        flyBehavior.fly();
    }

    public void performSwim(){
        swim.swim();
    }


    public  void setFlyBehavior(FlyBehavior fb){
        flyBehavior = fb;
    }

    public void setQuackBehavior(QuackBehavior qb){
        quackBehavior = qb;
    }

    public void setSwim(Swim s){
        swim = s;
    }


}
