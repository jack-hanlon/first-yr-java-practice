	import java.util.*;
	
	
	public class VigCipher{
	
		private static char[] alphabet = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
		
		
	public static void gui2(){
		System.out.println("\t************************************************************");
		System.out.println("\n");
		System.out.println("\t***Welcome to the Vigenere's Cipher Encrypter & Decrypter***\n");
			System.out.println("\tWhat would you like to do :\n\n\n");
			System.out.println("\tEncrypt String with a key 		 {A}\n");
			System.out.println("\tDecrypt String   			 {B}\n");
			System.out.println("\tFind key with Plain & Cipher text   	 {C}\n");
			System.out.println("\tEncrypt String with random key		 {D}\n");
			
			System.out.println("\tExit User Interface			 {E}\n");
			System.out.println("\t************************************************************");
			System.out.print("\tEnter: ");
			Scanner sc = new Scanner(System.in);
			String choice = sc.nextLine();
			if(choice.equals("A") || choice.equals("a")){
				enterUncoded();
				encryptString();
			}else if(choice.equals("B") || choice.equals("b")){
				System.out.print("test worked");
			}else if(choice.equals("C") || choice.equals("c")){
				System.out.print("test worked");
			}else if(choice.equals("D") || choice.equals("d")){
				System.out.print("test worked");;
			}else if(choice.equals("E") || choice.equals("e")){
				System.exit(0);
			}else{
				System.out.println("Incorrect value entered");
				gui2();
			}
		
	}
	public static void enterUncoded(){
		System.out.print("Enter the sentence you wish to encode: ");
		Scanner sc = new Scanner(System.in);
		String plain = sc.nextLine();
	}
	
	public static void numberKey(){
		//int[] key = 
		
	}
	
	public static void encryptString(){
		System.out.print("Enter your key: ");
		Scanner sc = new Scanner(System.in);
		String plaintext = sc.nextLine();
		char[] plainText = plaintext.toUpperCase().toCharArray();
		for(int a = 0; a < plainText.length; a++){
			char i = plainText[a];
			System.out.print(getIndex(i)+" ");
		}
		
		
	}
	public static int getIndex(char value){
		for(int i = 0; i < alphabet.length; i++){
			if(alphabet[i] == value){
				return i;
			}
		} return -1;
	}
	
		public static void main(String[] args){
			gui2();
			
		}
	
	
	}