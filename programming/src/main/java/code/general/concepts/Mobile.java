package code.general.concepts;

enum Mobile {
	Samsung(400), Iphone(500), Nokia(200);
	int price;
	
	Mobile(int price){
		this.price=price;
	}
	
	int showPrice(){
		return price;
	}
	
}