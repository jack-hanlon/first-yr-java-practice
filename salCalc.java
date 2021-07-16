import java.util.Scanner;
public class salCalc{
	
	
	public static void calcWage(){
		System.out.print("Enter number of weeks worked a year: ");
		Scanner sc = new Scanner(System.in);
		double week = sc.nextDouble();
		System.out.print("Enter number of hours worked a week: ");
		Scanner sh = new Scanner(System.in);
		double hours = sh.nextDouble();
		System.out.print("Enter yearly salary: ");
		Scanner ye = new Scanner(System.in);
		double salary = ye.nextDouble();
		double wage = salary / (week * hours);
		System.out.print("Wage: $"+(int)wage+" per hour");
		System.out.println("\nTry another? Enter (y/n) or go to salary (s)");
		Scanner test = new Scanner(System.in);
		String te = test.nextLine();
		if(te.equals("y")){
			calcWage();
		}else if(te.equals("n")){
			System.exit(0);
		}else if(te.equals("s")){
			calcSalary();
		}else{
			System.out.println("Incorrect value entered.... System exiting");
			System.exit(0);
		}
	}
	public static void calcSalary(){
		System.out.print("Enter hourly wage: ");
		Scanner sc = new Scanner(System.in);
		double wage = sc.nextDouble();
		System.out.print("Enter weeks worked per year: ");
		Scanner we = new Scanner(System.in);
		int week = we.nextInt();
		System.out.print("Enter hours worked per week: ");
		Scanner ho = new Scanner(System.in);
		int hours = ho.nextInt();
		double salary = week * hours * wage;
		System.out.println("\nSalary: $"+(int)salary+" per year");
		System.out.println("\nTry another? Enter (y/n) or go to wage(w)");
		Scanner test = new Scanner(System.in);
		String te = test.nextLine();
		if(te.equals("y")){
			calcSalary();
		}else if(te.equals("n")){
			System.exit(0);
		}else if(te.equals("w")){
			calcWage();
		}else{
			System.out.println("Incorrect value entered.... System exiting");
			System.exit(0);
		}
		
	}

	public static void main (String[] args){
		System.out.print("Enter w to calculate wage or s for salary (w,s)");
		Scanner scan = new Scanner(System.in);
		String scanTest = scan.nextLine();
		if(scanTest.equals("w")){
			calcWage();
		}else if(scanTest.equals("s")){
		calcSalary();
		}else{
			System.out.print("Incorrect value entered.... System exiting");
			System.exit(0);
		}
		
	}
}