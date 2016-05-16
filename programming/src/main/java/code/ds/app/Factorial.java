package code.ds.app;

public class Factorial {
	private int num;
	
	public Factorial(int num){
		if(num < 1){
			throw new IllegalArgumentException("Expected input should be greater than zero");
		}
		this.num=num;
	}

	public int factorial(int num){
		if(num == 1){
			return 1;
		}else{
			return num*factorial(num-1);
		}
	}
}
