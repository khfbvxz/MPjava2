package ThreadMultitasking;

public class YH {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 2;
		int i = 5;
		long result = 0;
		
		for(int n = 1; n <=i; n++) {
			result += power(x, n);  
			//  2  4    8    16   32  
			//  2  6   14     30  62 
			System.out.println(result);
		}
//		System.out.println(result);

	}
	static long power(int x, int n) {
		if(n==1) return x; // break ; 2 
		return x * power(x, n-1);
	}
	//2^1 2  2^2 = 4     
	// power(power(power(power)))
	/*power(2 ,5) --> 2 * 2 * 2 * 2 *2  ==  2 ^5 
	 *    return  2 * power(2 , 4)
	 *   				return  2 *power(2 , 3)			
	 *  							return  2 *power(2 , 2) 
	 *  										 return  2 *power(2 , 1) 
	 */												        

}
