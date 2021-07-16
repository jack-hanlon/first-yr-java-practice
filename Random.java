import java.util.*;


public class Random{
	public static void main(String[] args){
		for(int i = 0; i < 6; i++){
		double a = Math.random();
		int b = (int) (10 * a);
		System.out.println(b);
		}
	}
}