package code.ds.app;

public class Triangle {
	private int n;
	
	public Triangle(int n){
		if(n <1){
			throw new IllegalArgumentException("Input should be greater than zero");
		}
		this.n=n;
	}
	
	public int triangleValue(int n){
		if(n == 1){
			return 1;
		}else{
			return n+triangleValue(n-1);
		}
	}

}
