package code.ds.sorting;

public interface SortIface {

	void setArr(int arr[]);

	int[] getArr();

	/*
	 * for each pass:
	 *  next element is compared and moved
	 *  largest element is kept at the last.
	 * 
	 */
	void sort();

	void print();

}