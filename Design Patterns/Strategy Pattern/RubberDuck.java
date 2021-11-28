public class RubberDuck extends Duck{
  public RubberDuck(){
     flyBehavior = new NoWings();
     quackBehavior = new Squeck();
  }
  public void display(){
     System.out.println("I'm a rubber duck");
  }


}