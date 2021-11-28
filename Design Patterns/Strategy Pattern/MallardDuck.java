public class MallardDuck extends Duck{
  public MallardDuck(){
     flyBehavior = new FlyWings();
     quackBehavior = new Quack();
  }
  public void display(){
     System.out.println("I'm a mallard duck");
  }


}