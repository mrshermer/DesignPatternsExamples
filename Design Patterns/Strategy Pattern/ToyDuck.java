public class ToyDuck extends Duck{
  public ToyDuck(){
     flyBehavior = new JetPackWings();
     quackBehavior = new NoQuack();
  }
  public void display(){
     System.out.println("I'm a rubber duck");
  }


}