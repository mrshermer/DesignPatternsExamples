public class TestClass{
   public static void main(String[] args){
      Duck duck1 = new MallardDuck();
      duck1.display(); 
      duck1.fly();
      duck1.quack();
      
      System.out.println();
      
      Duck duck2 = new ToyDuck();
      duck2.display();
      duck2.fly();
      duck2.quack();
      
      System.out.println();
      
      Duck duck3 = new RubberDuck();
      duck3.display();
      duck3.fly();
      duck3.quack();
      
      System.out.println();
      
      Plane plane1 = new Boeing747();
      plane1.display();
      plane1.fly();
      


     
   }
}