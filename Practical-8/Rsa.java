class Rsa{
	public static int squareAndMultiply(int decimal, int exponent, int mod){
		int result=decimal;
		String binary = Integer.toBinaryString(exponent);
		int binaryLength = binary.length();
		int bool;
		for(int i=1;i<binaryLength;i++){
			bool = Integer.parseInt(""+binary.charAt(i));
			if(bool==1){
				result = result*result;	
				result = result*decimal;
				result = result%mod;
			}
			else{
				result = result*result;
				result = result%mod;				
			}
		}
		return result;
		}
		
	static int gcd(int a, int b){ 
        // Everything divides 0  
        if (a == 0) 
          return b; 
        if (b == 0) 
          return a; 
       
        // base case
        if (a == b) 
            return a; 
       
        // a is greater 
        if (a > b) 
            return gcd(a-b, b); 
        return gcd(a, b-a); 
    } 

	public static void main(String args[]){
		int p=11, q=37, n = p*q, n1=(p-1)*(q-1), e=2,message = 12;
		while(gcd(n1,e)!=1){
			e++;
		}
		int temp = 1/e;
		int d = temp%n1;
		System.out.println(d);
		int encryption = squareAndMultiply(message,e,n);
		int decryption = squareAndMultiply(encryption,d,n);
		System.out.println(encryption);
		System.out.println(decryption);
	}
}