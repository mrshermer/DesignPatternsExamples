public class SubscriberOne implements Observer, DisplayNotifications{
   private String breakingNews = "", quoteDay = "", unreadNews = "";
   private Subject publisher;
   
   public SubscriberOne(Subject sub){
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
     System.out.println("SUBCRIBER ONE:\nBreaking News: " + breakingNews + "\nYour quote of the day: " + quoteDay + "\nYou have an unread News article: " + unreadNews);
     System.out.println();
   }   
}