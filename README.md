# Newspaper-Subscription-calculator-Using-Inheritance 
Determines the price of the newspaper the customer is ordering
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
      add2.setAddress("@gmail.com"); 
      
      PhysicalNewspaperSubscription add3 = new PhysicalNewspaperSubscription();
      add.setName("Jeff ");
      add.getName();
      //invalid input to show how error is displayed
      add.setAddress("i");
       

            }
      }
      
      
      
      //Program public OnlineNewspaperSubscription
//Written by Alec Narkizian
//created on 7.15,2017
//Extends the class NewspaperSubscription
//If somone is signing up using thier email it goes through here
//This class checks if the email is valid and calculates the rate accordingly
public class OnlineNewspaperSubscription extends NewspaperSubscription{
       public void setAddress(String address) {
        rate = 0;
        //the condition for the email
      if (address.contains("@"))
      {
               this.address = address;
               //charging the rate
               rate +=9;
               System.out.print(", " + address + ", ");
               PhysicalNewspaperSubscription add3 = new PhysicalNewspaperSubscription();
               add3.getRate(rate);
               }
               //if there is a bad input
      else 
         System.out.println(",used invalid input for address, subscription rate is $0");    
     }
}




//Program public NewspaperSubscription
//Written by Alec Narkizian
//created on 7.15,2017
//takes in input from sub-classes and prints it 
import java.util.Scanner;
public class NewspaperSubscription{
String name;
String address = "";
double rate = 0;
 
   public void setName(String name) 
   {
   //changes the name
     this.name = name;  
      
        } 
   public String getName()
   
   {
   //prints and retunrs the value of name 
      System.out.print(name);
     return name;
     
     }
     
   public String getAdd()
   {
   //gets the value of address
   System.out.println(address);
   return address;
   
   }
   public double getRate(double rate)
   {

   //gets the value of the rate
   System.out.println("$" + rate);
     return rate;
   
 }
 
 }

 
//Program public PhysicalNewspaperSubscription
//Written by Alec Narkizian
//created on 7.15,2017
//Extends the class NewspaperSubscription
//If somone is signing up using thier actual address  
//This class checks if the address is valid and calculates the rate accordingly
   public class PhysicalNewspaperSubscription extends NewspaperSubscription{
      public void setAddress(String address) {
      rate = 0;
      //checks the address
      if (address.length() > 1){
               this.address = address;
               //charges rate 
               rate +=15.0;
               System.out.print(", " + address + ", ");
               PhysicalNewspaperSubscription add3 = new PhysicalNewspaperSubscription();
               //calls the PhysicalNewspaperSubscription class and method getRate
               add3.getRate(rate);
               }
               //if invalid input
      else 
         System.out.println(",used invalid input for address, subscription rate is $0");    
     }
}

    
