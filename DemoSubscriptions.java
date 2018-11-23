//Program public DemoSubscriptions class, Lab 13
//Written by Alec Narkizian
//created on 7.15,2017
//Extends the class NewspaperSubscription
//this program generates four objects that are passed to other classes
public class DemoSubscriptions extends NewspaperSubscription{
   public static void main(String[] args){
      String name = "Alec ";
      String address = "121 glasgow lane";
      //calling the PhysicalNewspaperSubscription class
      PhysicalNewspaperSubscription add = new PhysicalNewspaperSubscription();
      //putting info into the other classes setName and setAddress method 
      add.setName(name);
      add.getName();
      add.setAddress(address);
      //calling the online newspaper
      OnlineNewspaperSubscription add1 = new OnlineNewspaperSubscription();
      add1.setName("Alex ");
      add1.getName();
      add1.setAddress("Anarkizian@gmail.com");  
      
     OnlineNewspaperSubscription add2 = new OnlineNewspaperSubscription();
      add2.setName("Sean ");
      add2.getName();
      //no @ sign to show the data can handle an error 
      add2.setAddress("Agmail.com"); 
      
      PhysicalNewspaperSubscription add3 = new PhysicalNewspaperSubscription();
      add.setName("Jeff ");
      add.getName();
      //invalid input to show how error is displayed
      add.setAddress("i");
       

            }
      }