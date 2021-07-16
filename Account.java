import java.util.Scanner;

public class Account extends BankofJack {
   private String name;
   private String address;
   private double balance;
   
   public void setName(String n){
	   name = n;
   }
   public String getName(){
	   return name;
   }
   public void setAddress(String a){
	   address = a;
   }
   public String getAddress(){
	   return address;
   }
   public void setBalance(double b){
	   balance = b;
   }
   public double getBalance(){
	   return balance;
   }
   public double getInterest(double percentageRate){
		return balance*percentageRate/100;
   }
   public double depositSaving(double input){
	   return balance;
   }
   
}
