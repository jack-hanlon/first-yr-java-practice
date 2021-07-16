import java.util.Scanner;
import java.util.*;

public class cipher {
	private String p1 = "";
	public static int key;
	public static int count = 0;
	
    private Character[] alphabet = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
    private char[] decodedText;
    private String[] plainText;
    private java.util.List<Character> alphabetList;
	
	
	public cipher(){
        alphabetList = java.util.Arrays.asList(alphabet);
        plainText = new String[alphabet.length];
    }
	
	public static void gui(){
		System.out.println("\t************************************************************");
		System.out.println("\n");
		System.out.println("\t***Welcome to the Caesar Cipher Encrypter & Decrypter***\n");
			System.out.println("\tWhat would you like to do :\n\n\n");
			System.out.println("\tEncrypt String with a key 		 {A}\n");
			System.out.println("\tDecrypt String   			 {B}\n");
			System.out.println("\tFind key with Plain & Cipher text   	 {C}\n");
			System.out.println("\tEncrypt String with random key		 {D}\n");
			System.out.println("\tUse Code Cracker Tool			 {E}\n");
			System.out.println("\tExit User Interface			 {F}\n");
			System.out.println("\tGo to Vigeneres Cipher GUI		 {G}");
			System.out.println("\t************************************************************");
			Scanner sc = new Scanner(System.in);
			String choice = sc.nextLine();
			if(choice.equals("A") || choice.equals("a")){
				encryptPlainText();
				System.out.println("\n");
				gui();
			}else if(choice.equals("B") || choice.equals("b")){
				decryptCipherText();
				System.out.println("\n");
				gui();
			}else if(choice.equals("C") || choice.equals("c")){
				System.out.println("key: "+keyCalculator());
				gui();
			}else if(choice.equals("D") || choice.equals("d")){
				randomEncrypter();
				System.out.println("\n");
				gui();
			}else if(choice.equals("E") || choice.equals("e")){
				System.out.print("Please enter cipher text for brute force attack: ");
				cipher t = new cipher();
				Scanner tb = new Scanner(System.in);
				String ctext = tb.nextLine();
				for(String pt : t.producePlaintext(ctext)) {
				System.out.println(pt);
				}
				gui();
			}else if(choice.equals("F") || choice.equals("f")){
				System.exit(0);
			}else{
				System.out.println("Incorrect value entered");
				gui();
			}
	}
	  

    public String[] producePlaintext(String cipherText) {
        
        char[] message = cipherText.toUpperCase().toCharArray();
        
        for (int key = 0; key < alphabet.length; key++) {
            
            decodedText = new char[message.length];
            
            for (int i = 0; i < message.length; i++) {

                
                if (message[i] != ' ') {
                    decodedText[i] = alphabet[(alphabetList.indexOf(message[i])+key) % alphabet.length];
                }else{
                    decodedText[i] = ' ';
                }
            }
            plainText[key] = String.valueOf(decodedText);
        }
        return plainText;
    }
	
	public static void encryptPlainText(){
		System.out.println("Please enter your Plain Text: ");
		Scanner sc = new Scanner(System.in);
		String pl =sc.nextLine();
		pl = pl.toUpperCase();
		char[] plainTextChar = pl.toCharArray();
		System.out.print("Please enter your key: ");
		Scanner inte = new Scanner(System.in);
		key = inte.nextInt();
		for(int i = 0; i < plainTextChar.length; i++) {
				plainTextChar[i] = (char)(((int)plainTextChar[i]+key-65)%26 + 65);
		}
		System.out.println("\t"+String.valueOf(plainTextChar));
	}
	
	 public static void decryptCipherText(){
		
		System.out.print("\tPlease Enter Ciphertext As Displayed For Deciphering: ");
		Scanner sc = new Scanner(System.in);
		String decrypted = sc.nextLine();
		char[] cipherTextChar = decrypted.toCharArray();
		System.out.print("\tPlease enter key: ");
		Scanner scan = new Scanner(System.in);
		int key = scan.nextInt();
        for(int i = 0; i < cipherTextChar.length; i++){
			int c = cipherTextChar[i];
			if (Character.isUpperCase(c)){
                c = c - (key % 26);
                if (c < 'A'){
                c = c + 26;
				}

           }

            else if (Character.isLowerCase(c)){
                c = c - (key % 26);
                if (c < 'a'){
                c = c + 26;
				}
            }

            cipherTextChar[i] = (char) c;

        }
		System.out.println("\n");
        System.out.println("\t"+String.valueOf(cipherTextChar));

    }
	public static int keyCalculator(){
			
		int countPlain = 0;
		int countCipher = 0;
		int a = countPlain;
		int b = countCipher;
		int diff;
	
		String alpha = "abcdefghijklmnopqrstuvwxyz";
		char[] alphabet = alpha.toCharArray();
		System.out.println("Please enter your plainText:");
		Scanner sc = new Scanner(System.in);
		String plain = sc.nextLine();
		System.out.println("Please enter your Cipher Text:");
		Scanner two = new Scanner(System.in);
		String cipher = two.nextLine();
		char[] cipherT = cipher.toCharArray();
		char[] plainT = plain.toCharArray();
		for(int i =0; i < alphabet.length; i++){
			if(plainT[0] == alphabet[i]){
			 a = countPlain;
			}countPlain++;
			}
		for(int i =0; i < alphabet.length; i++){
			if(cipherT[0] == alphabet[i]){
			 b = countCipher;
			}countCipher++;
			}
			 diff = Math.abs(b-a);
					return diff;
	}
	public static void randomEncrypter(){
		System.out.println("Please enter your Plain Text: ");
		Scanner sc = new Scanner(System.in);
		String pl =sc.nextLine();
		pl = pl.toUpperCase();
		char[] plainTextChar = pl.toCharArray();
		int kee =  (int)(Math.random()*100);
		for(int i = 0; i < plainTextChar.length; i++) {
				plainTextChar[i] = (char)(((int)plainTextChar[i]+kee-65)%26 + 65);
		}
		System.out.println("\t"+String.valueOf(plainTextChar));
	}
	
	


	
	public static void main (String[] args){
		gui();
	}
}