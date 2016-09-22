package code.ds.sorting;

public class BubbleSort extends ParentSort {
	public BubbleSort(int maxSize){
		this.maxSize=maxSize;
		arr=new int[maxSize];
	}
	
	/*
	 * for each pass:
	 *  next element is compared and moved
	 *  largest element is kept at the last.
	 * 
	 */
	/* (non-Javadoc)
	 * @see code.ds.sorting.SortIface#sort()
	 */
	@Override
	public void sort(){
		boolean swapped=true;
		int processingIndex=arr.length;
		
		while(swapped && processingIndex >0){
			swapped=false;
			for(int i=0;i<processingIndex-1;i++){
				if(arr[i]> arr[i+1]){
					swap(i,i+1);
					swapped=true;
				}
			}
			processingIndex--;
		}
	}
	
}
