package code.general.concepts;

public class EnumDemo{
	
	public static void main(String args[]){
		for (Mobile m : Mobile.values()){
			System.out.println("Mobile Name:"+m.name()+" Price: "+m.showPrice());
			
		}
		
	}
	
}
