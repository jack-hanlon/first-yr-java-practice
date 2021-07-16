import java.util.*;
import java.util.Scanner;
public class TowersOfHanoi {

	private static int count;
   public void solve(int n, String start, String auxiliary, String end) {
       if (n == 1) {
           System.out.println(start + " -> " + end);
		   count++;
       } else {
           solve(n - 1, start, end, auxiliary);
           System.out.println(start + " -> " + end);
		   count++;
           solve(n - 1, auxiliary, start, end);
       }
   }

   public static void main(String[] args) {
	   count = 0;
       TowersOfHanoi towersOfHanoi = new TowersOfHanoi();
       System.out.print("Enter number of discs: ");
       Scanner scanner = new Scanner(System.in);
       int discs = scanner.nextInt();
       towersOfHanoi.solve(discs, "T1", "T2", "T3");
	   System.out.println("\nSteps: "+count);
   }
}
