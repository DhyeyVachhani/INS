class Vigenere{
	
	public static void main(String args[]){
		String plainText="TROJAN";
		String key="VIRUS";
		int plainTextLength=plainText.length(),keyLength=key.length();//storing length of plaintext and key in a variable
		int temp=0;//temporary variable used for processeing whenever needed
		String encryptedText="",decryptedText="";
		
		if(plainTextLength>keyLength){//making the length of plainText and key equal
		
			for(int i=0;i<(plainTextLength-keyLength);i++){
				key = key + Character.toString(key.charAt(temp));
				temp++;
				
				if(temp==(keyLength)){//if key reaches at its end but still if its length is less than plaintext we have to iterate it again
					temp=0;
				}
			}
		}
		System.out.println(key);
		
		//code to encrypt plainText
		
		for(int i=0;i<plainTextLength;i++){
			temp = plainText.codePointAt(i) + key.codePointAt(i); // this variable has ascii code of encrypted character
			
			if(temp>90){ 
				temp = temp%26+65;
			}
			System.out.println(temp);
			encryptedText = encryptedText + Character.toString((char)temp);//apending encrypted character one by one
		}
		
		// code to decrypt encrypted text
		
		for(int i=0;i<plainTextLength;i++){
			
			temp = ((encryptedText.codePointAt(i) - key.codePointAt(i) + 26)%26)//answer on 0-25+65;// this variable has ascii code of decrypted character
			decryptedText = decryptedText + Character.toString((char)temp);//apending encrypted character one by one
		}
		
		System.out.println("Encrypted Text : "+encryptedText);
		System.out.println("Decrypted Text : "+decryptedText);
	}
}