	/*public static void codeCracker(){
		
		System.out.print("Ciphertext: ");
		Scanner sc = new Scanner(System.in);
		String decrypted = sc.nextLine();
		char[] cipherTextChar = decrypted.toCharArray();
		for(int key = 0; key < 27; key++){
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
        System.out.println("\t"+String.valueOf(cipherTextChar));




}
	}*/