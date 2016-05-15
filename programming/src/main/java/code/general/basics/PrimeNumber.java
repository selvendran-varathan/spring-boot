package code.general.basics;

public class PrimeNumber {
	public boolean primeNumberCheck(double n){
		int sqrt = (int) Math.sqrt(n);
		
		if(n < 2)
			throw new IllegalArgumentException("Invalid input. Should be greter than 1");
		
		for(int i=2;i<sqrt;i++){
			if(n%i==0){
				System.out.println("Not a Prime Number : "+n);
				return false;
			}
		}
		System.out.println("Prime Number : "+n);
		return true;
	}
	

}
