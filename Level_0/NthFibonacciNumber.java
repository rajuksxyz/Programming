public class NthFibonacciNumber{
	
	private int findNthFibonacciNumber(int n){
		
			if(n == 0 || n == 1) return n;
			
			int a = 0, b = 1, c = 0;
			
			for(int i = 2 ; i <= n; i++){
					
					c = a + b;
					a = b;
					b = c;
					
			}
			
			return c;
		
	}
	
	public static void main(String[] args){
		
		System.out.print("Enter Nth Number : ");
		System.out.println("\nOutput : "+ new NthFibonacciNumber().findNthFibonacciNumber(new java.util.Scanner(System.in).nextInt()));
		
	}
	
	
}