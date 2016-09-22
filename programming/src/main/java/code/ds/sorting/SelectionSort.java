package code.ds.sorting;

public class SelectionSort extends ParentSort {
	
	public SelectionSort(int maxSize){
		this.maxSize=maxSize;
		arr=new int[maxSize];
	}
	
	@Override
	public void sort() {
		int pIndex=arr.length;
		int maxElementIndex=0;
		
		while(pIndex>0){
			maxElementIndex=0;
			for(int i=0;i<pIndex;i++){
				if(arr[i]>arr[maxElementIndex]){
					maxElementIndex=i;
				}
			}
			swap(maxElementIndex,pIndex-1);
			pIndex--;
		}
	}


}
