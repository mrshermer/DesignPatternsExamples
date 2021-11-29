public class SubscriberTwo implements Observer, DisplayNotifications{
   private String breakingNews = "", quoteDay = "", unreadNews = "";
   private Subject publisher;
   
   public SubscriberTwo(Subject sub){
      this.publisher = sub;
      publisher.registerObserver(this);
   }
   public void update(String bN, String qD, String uRN){
     this.breakingNews = bN;
     this.quoteDay = qD;
     this.unreadNews = uRN;
     display();
   }
   public void display(){
     System.out.println("SUBCRIBER TWO:\nBreaking News : " + breakingNews + "\nYour quote of the day: " + quoteDay + "\nYou have an unread News article " + unreadNews);
     System.out.println();
   }   
}