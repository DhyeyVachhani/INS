class SquareMultiply{
	
		public int squareAndMultiply(int decimal, int exponent, int mod){
		int result=decimal;
		String binary = Integer.toBinaryString(power);
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
	
	public static void main(String args[]){
		
	}
}