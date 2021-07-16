import java.util.*;
import java.util.Scanner;

public class encryptV{


    private Character[] alphabet = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
    private char[] decodedText;
    public static String[] plainText;
    private java.util.List<Character> alphabetList;
	
	
	public encryptV(){
        alphabetList = java.util.Arrays.asList(alphabet);
        plainText = new String[alphabet.length];
    }
	
	public static void encryptStringA(){
		Scanner sc = new Scanner(System.in);
		plainText = sc.nextLine();
		Scanner k = new Scanner(System.in);
		String key = k.nextLine();
		char[] keys = key.toCharArrray();
		char[] plainTextArray = plainText.toCharArrray();
		
		for(int i = 0; i < plainTextArray.length; i++) {
				key += 1;
				plainTextArray[i] = (char)(((int)plainTextArray[i]+key-65)%26 + 65);
		}
		System.out.println("\t"+String.valueOf(plainTextArray));
		
	}

public static void main (String[] args){
		encryptStringA();
}
}
