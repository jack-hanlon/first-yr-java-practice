import java.util.*;
import java.util.Scanner;

public class BankofJack{

	/** Banking Interface for Users*/
	
	public static void Login(){
		System.out.println("\t***********************************");
		System.out.println("\tWelcome to the Bank of Jack\n\n\n \tPlease enter your Name and Password\n");
		System.out.print("\tName: ");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		System.out.print("\tPassword: ");
		Scanner scan = new Scanner(System.in);
		double password = scan.nextDouble();
		if(name.equals("Jack") && password == 1873){
			RunInteraction();
		}else {
			System.out.println("The given username or password is incorrect");
		}
	}
	/** Sets up users account*/
	  public static void AccountSetup(){
        Account myAccount;
        Account yourAccount;
        myAccount = new Account();
        yourAccount = new Account();

		myAccount.setName("\n\tChequing");
		myAccount.setAddress("45.61.5.4564");
		myAccount.setBalance(339.31);
		
		yourAccount.setName("\tSaving");
		yourAccount.setAddress("45.62.3.2346");
		yourAccount.setBalance(9701.43);
		
         System.out.print(myAccount.getName());
         System.out.print(" (");
         System.out.print(myAccount.getAddress());
         System.out.print(")-------- $");
         System.out.print(myAccount.getBalance());
         System.out.println();

         System.out.print(yourAccount.getName());
         System.out.print(" (");
         System.out.print(yourAccount.getAddress());
         System.out.print(")---------- $");
         System.out.println(yourAccount.getBalance());
		
		
    }

		
		 public static void DepositSaving(){
			 
		 }
		 public static void eTransferWithdrawal(){
			 
		 }
		 /** Handles the interactions in the interface*/
		public static void RunInteraction(){
			System.out.println("\n");
			System.out.println("\tWhat would you like to initiate :\n\n\n");
			System.out.println("\tDeposit to Chequing  	 {A}\n");
			System.out.println("\tDeposit to Savings   	 {B}\n");
			System.out.println("\tWithdrawal   		 {C}\n");
			System.out.println("\tMake e-Transfer		 {D}\n");
			System.out.println("\tView e-Statement	 {E}\n");
			System.out.println("\t***********************************");
			System.out.print("\tEnter letter here: ");
			Scanner sc = new Scanner(System.in);
			String letter = sc.nextLine();
			if(letter.equals("A") || letter.equals("a")){
				
				/*double original = myAccount.getBalance();
				System.out.print("\n/tDeposit Amount: ");
				Scanner john = new Scanner(System.in);
				double deposit = john.nextDouble();
				double end = original + deposit;
				myAccount.setBalance(end);
				System.out.println("Chequing : "+myAccount.getBalance); */
				
			}else if(letter.equals("B") || letter.equals("b")){
				System.out.println("test worked");
			}else if(letter.equals("C") || letter.equals("c")){
				System.out.println("test worked");
			}else if(letter.equals("D") || letter.equals("d")){
				System.out.println("test worked");
			}else if(letter.equals("E") || letter.equals("e")){
				AccountSetup();
			}else if(letter.equals("F") || letter.equals("f")){
				System.out.println("test worked");
			}else{
				System.out.println("Incorrect value entered");
			}
			
		}
public static void main(String[] args){
	Login();
	
}

}