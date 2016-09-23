package code.ds.sorting;

import java.util.Arrays;

public class InsertionSort extends ParentSort {

	public InsertionSort(int maxSize){
		this.maxSize=maxSize;
		arr=new int[maxSize];
	}
	/*
	 * (non-Javadoc)
	 * @see code.ds.sorting.ParentSort#sort()
	 * for each element, find the position of sub sorted array and insert,
	 * continue till all items are processed
	 */
	@Override
	public void sort() {
		int lIndex=arr.length;
		int pIndex=0;
		boolean insertPosFound;
		
		//process all the elements
		while(pIndex<lIndex){
			insertPosFound=false;
			int element =arr[pIndex];
			int subPIndex=0;
			
			//find the insert pos and move the elements if needed
			//increment subSortArrMaxIndex
			while(!insertPosFound && subPIndex < pIndex ){
				if(subPIndex==pIndex){
					insertPosFound=true;
				}else if(element > arr[subPIndex]){
					subPIndex++;
				}else{
					insertPosFound=true;
					shiftElementsRight(subPIndex, pIndex);
					arr[subPIndex]=element;
				}
			}
			pIndex++;
		}
		
	}

	private void shiftElementsRight(int start, int end) {
		while(end>start){
			arr[end]=arr[end-1];
			end--;
		}
		
	}
	

}
