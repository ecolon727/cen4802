package softInt;
import java.util.Scanner;

/**
 * Contains fibonacci method and main()
 * 
 * @author Colon
 */
public class FibonacciCalc {
	
	// stores fibonacci numbers for easy access
	private static long[] fibonacciCache;
	
	/**
	 * main() - executes /outputs fibonacci method
	 * 
	 * @param args - allows fibonacci method to function
	 */
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);	
			
		System.out.println("Type integer to find it's fibonacci number: ");
		int n = scnr.nextInt();
		
		// array precisely fits n indices 
		fibonacciCache = new long[n + 1];	
		System.out.println("The " + n + "th term of the fibonacci sequence is: "
							      + fibonacci(n)  );	
	}
	
	
	
	/**
	 * 
	 * Recursively alculates the nth fibonacci number and its value
	 * 
	 * @param n     - user input for nth fibonacci number
	 * @return long - stores large fibonacci numbers 
	 */
	private static long fibonacci(int n) {
		
		// 0,1 = base case
		if (n <= 1)
			return n;
		
		// returns calculated fibonacci numbers
		// for shorter execution time
		if(fibonacciCache[n] != 0) {
			return fibonacciCache[n];
		}
		
		// calculates previous fibonacci numbers to find nth fibonacci
		long nthFibNum = fibonacci(n - 1) + fibonacci(n - 2);
		fibonacciCache[n] = nthFibNum;
		return nthFibNum;
	}

	
}
