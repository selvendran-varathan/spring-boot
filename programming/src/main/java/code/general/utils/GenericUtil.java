package code.general.utils;

import org.apache.commons.math3.random.RandomDataImpl;

import code.ds.impl.ArrayImpl;

public class GenericUtil {

	public GenericUtil() {
		// TODO Auto-generated constructor stub
	}
	
	public static void fillArray(ArrayImpl arrayImpl, int start, int end){
		for(int i=0;i<arrayImpl.getMaxSize();i++){
			RandomDataImpl randomData = new RandomDataImpl(); 
			arrayImpl.insert(randomData.nextLong(start, end));
		}
	}

}
