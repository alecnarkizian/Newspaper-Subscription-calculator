//Program public NewspaperSubscription class, Lab 13
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

 
  
    