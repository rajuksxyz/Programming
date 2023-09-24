public class NthFibonacciNumber{
	
	private int findNthFibonacciNumber(int n){
		
		if(n == 0 || n ==1 ) return n;
		return findNthFibonacciNumber(n-1) + findNthFibonacciNumber(n-2);
		
	}
	public static void main(String[] args){
		
		System.out.print("Enter Number: ");
		System.out.println("Output: "+ new NthFibonacciNumber().findNthFibonacciNumber(new java.util.Scanner(System.in).nextInt()));
		
	}
	
}