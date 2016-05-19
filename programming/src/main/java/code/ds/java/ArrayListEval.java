package code.ds.java;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEval {
	
	private List<String> arrList = new ArrayList<String>();
	
	public void testMethods(){
		arrList.add("AddValue");
		arrList.add(0,"AddAtZeroIndex");
		System.out.println("arrList: "+arrList);
		arrList.remove(0);
		System.out.println("arrList contains 'AddValue' ? "+arrList.contains("AddValue"));
	}
}
