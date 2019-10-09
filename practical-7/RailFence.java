class RailFence{
	public static void main(String args[]){
		String plainText="trojan";
		String encryptedText="",decryptedText="";//initialized
		int plainTextLength = plainText.length();
		
		//encryption
		for(int i=0;i<plainTextLength;i++){
			if(i%2==0){// for even
				encryptedText = encryptedText + plainText.charAt(i);
			}
		}
		
		for(int i=0;i<plainTextLength;i++){
			if(i%2==1){// for odd
				encryptedText = encryptedText + plainText.charAt(i);
			}
		}
		
		//decryption
		int k = 0;//temps variable for traversing the loop from index 0
		int index = (int)Math.ceil(plainTextLength/2);
		for(int i = index; i<plainTextLength;i++){
			decryptedText = decryptedText + encryptedText.charAt(k);
			decryptedText = decryptedText + encryptedText.charAt(i);
			k++;
		}
		
		System.out.println("Encrypted Text : "+encryptedText);
		System.out.println("Decrypted Text : "+decryptedText);
	}
}