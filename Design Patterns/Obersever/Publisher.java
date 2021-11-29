import java.util.ArrayList;

public class Publisher implements Subject{
  private ArrayList<Observer> observers;
  private String breakingNews = "", quoteOfTheDay = "", unreadArticlesNotifications = "";
  
  public Publisher(){
     observers = new ArrayList<Observer>();
  }
  public void registerObserver(Observer ob){
    observers.add(ob);
  }
  public void removeObserver(Observer ob){
     int obIndex = observers.indexOf(ob);
     if( obIndex >= 0){
        observers.remove(obIndex);
     }
  }
  public void notifyObservers(){
     for(int a = 0; a < observers.size(); a++){
         Observer obser = (Observer)observers.get(a);
         obser.update(breakingNews, quoteOfTheDay, unreadArticlesNotifications);
     }
     
  }
  public void dataNotifications(){
     notifyObservers();
  }
  public void setNotifications(String bN, String qD, String uRA){
     this.breakingNews = bN;
     this.quoteOfTheDay = qD;
     this.unreadArticlesNotifications = uRA;
     dataNotifications();
  }
}