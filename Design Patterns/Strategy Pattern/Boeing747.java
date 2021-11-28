public class Boeing747 extends Plane{
    public Boeing747(){
       flyBehavior = new FlyWings();
    }
    public void display(){
       System.out.println("I'm a plane");
    }
}