//Program public PhysicalNewspaperSubscription class, Lab 13
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
