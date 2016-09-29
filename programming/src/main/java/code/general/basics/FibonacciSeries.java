package code.general.basics;

/*  Fibonacci Series
 * 	//   n=1,2,3,4,5,6,
 *	//f(n)=1,1,2,3,5,8,
 */
public class FibonacciSeries {
	
	 /*
	 * Regular method for fibonacci series
	 */
	public static int fibRegular(int n){
		if(n < 0 || n > 1000)
			throw new IllegalArgumentException("Fib input should be in the range (0-1000)");
		if(n == 1 || n ==2){
			return 1;
		}
		int fibo1=1,fibo2=1,fibonacci = 1;
		for(int i=3; i<=n;i++){
			fibonacci=fibo1+fibo2;
			fibo1=fibo2;
			fibo2=fibonacci;
		}
		return fibonacci;
	}
	
	 /*
	 * Recursive method for finonacci series
	 */
	public static int fibRecursive(int n){
		
		if(n==1 || n==2)
			return 1;
		if(n < 0 || n > 1000)
			throw new IllegalArgumentException("Fib input should be in the range (0-1000)");
		
		return fibRecursive(n-1)+fibRecursive(n-2);
	}
	

}
