package code.ds.sorting;

public class QuickSort extends ParentSort {
	public QuickSort(int maxSize){
		this.maxSize=maxSize;
		arr=new int[maxSize];
	}

	@Override
	public void sort() {
		int startIndex=0;
		int endIndex=arr.length-1;
		System.out.println("endIndex:"+endIndex);
		quickSort(startIndex,endIndex);

	}

	private void quickSort(int startIndex, int endIndex) {
		int leftIndex=startIndex;
		int rightIndex=endIndex;
		
		int pivot = arr[leftIndex];
		while(leftIndex <= rightIndex){
			while(arr[leftIndex] < pivot){
				leftIndex++;
			}
			while(arr[rightIndex] > pivot){
				rightIndex--;
			}
			
			if(leftIndex<=rightIndex)
			{
				swap(leftIndex,rightIndex);
				leftIndex++;
				rightIndex--;
			}
			
		}
		System.out.println("leftIndex: "+leftIndex+" rightIndex: "+rightIndex);
		if(startIndex<rightIndex){
			quickSort(startIndex,rightIndex);
		}
		if(endIndex>leftIndex){
			quickSort(leftIndex,endIndex);
		}
	}

}
