package code.ds.sorting;

import static org.junit.Assert.assertArrayEquals;

import java.util.Arrays;

public class SortTest {
	int[] arr={1,4,2,5,3,2,10,7};
	//int[] arr={1,1,4,2,5,3,2,10,7,7};
	int maxSize=arr.length;
	public SortTest() {
		super();
	}
	
	public void test(SortEnum sortEnum){
		SortIface sIface = null;
		if(sortEnum.equals(SortEnum.Bubble)){
			sIface = new BubbleSort(maxSize);
		}
		if(sortEnum.equals(SortEnum.Quick)){
			sIface = new QuickSort(maxSize);
		}
		if(sortEnum.equals(SortEnum.Insertion)){
			sIface = new InsertionSort(maxSize);
		}
		if(sortEnum.equals(SortEnum.Selection)){
			sIface = new SelectionSort(maxSize);
		}
		sIface.setArr(arr);
		sIface.print();
		sIface.sort();
		sIface.print();
		Arrays.sort(arr);
		assertArrayEquals(arr, sIface.getArr());
	}

}