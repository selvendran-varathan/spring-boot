package code.general.utils;

import java.util.HashMap;
import java.util.Map;

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
	
	public static void testHashmapBehavior(){
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		int value = map.get(2);
		System.out.println("Value : "+value);
	}

}
