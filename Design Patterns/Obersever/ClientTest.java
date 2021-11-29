public class ClientTest{
  public static void main(String[] args){
     Publisher pub = new Publisher();
     
     SubscriberOne sub1 = new SubscriberOne(pub);
     SubscriberTwo sub2 = new SubscriberTwo(pub);
     SubscriberThree sub3 = new SubscriberThree(pub);
     
     pub.setNotifications("Tree falls on ground", "Be smart and stay wise", "How to make a cake");
     
  }

}