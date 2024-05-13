package softInt;
import java.util.Scanner;


public class FibonacciCalc {
	
	private static long[] fibonacciCache;
	
	
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);	
			
		System.out.println("Type integer to find it's fibonacci number: ");
		int n = scnr.nextInt();
		
		fibonacciCache = new long[n + 1];	
		System.out.println("The " + n + "th term of the fibonacci sequence is: "
							      + fibonacci(n)  );	
	}
	

	private static long fibonacci(int n) {
		
		// 0,1 = base case
		if (n <= 1)
			return n;
		
		if(fibonacciCache[n] != 0) {
			return fibonacciCache[n];
		}
		
		long nthFibNum = fibonacci(n - 1) + fibonacci(n - 2);
		fibonacciCache[n] = nthFibNum;
		return nthFibNum;
	}

	
	
	
	
	
}
