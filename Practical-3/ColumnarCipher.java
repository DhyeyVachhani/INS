class ColumnarCipher{
	public static void main(String args[]){
		String msg=args[0];
		String key="4132";
		String em = "";
		
		char[][] charMsg = new char[4][4];
		char[][] encryptedcharMsg = new char[4][4];
		int k=0;
		for(int i = 0; i<4; i++){
			
			for(int j = 0; j<4; j++){
				if(k == msg.length())
				{}
				else{
				charMsg[i][j] = msg.charAt(k);
				k++;
				}
			}
		}
		String encryptedMessage = "";
			for(int l =0 ; l<key.length();l++){
				char tempc = key.charAt(l);
				int temp = Character.getNumericValue(tempc);
				temp--;
			for(int j = 0; j<4; j++){
				 encryptedMessage += charMsg[j][temp];
				//System.out.print(charMsg[j][temp]);
			}
			}
			//System.out.print(encryptedMessage);
			k=0;
		for(int i = 0; i<4; i++){
			
			for(int j = 0; j<4; j++){
				if(k == encryptedMessage.length())
				{}
				else{
				encryptedcharMsg[i][j] = encryptedMessage.charAt(k);
				k++;
				}
			}
		}
		for(int l =0 ; l<key.length();l++){
				char tempc = key.charAt(l);
				int temp = Character.getNumericValue(tempc);
				temp--;
				
			for(int j = 0; j<4; j++){
				em = em + charMsg[j][temp];
			}
		}
		
		System.out.println("Encrypted Message : ");
		System.out.println(encryptedMessage);
		System.out.println("Decrypted message : ");
		System.out.println(em);
	}
}