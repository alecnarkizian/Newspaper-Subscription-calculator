//Program public OnlineNewspaperSubscription class, Lab 13
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
