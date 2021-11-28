public class Duck{
  protected FlyBehavior flyBehavior;
  protected QuackBehavior quackBehavior;

  public void display(){
    return;
  }
  public void fly(){
    flyBehavior.fly();
  }
  public void quack(){
    quackBehavior.quack();
  }
}