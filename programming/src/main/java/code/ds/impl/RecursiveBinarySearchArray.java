package code.ds.impl;

public class RecursiveBinarySearchArray {
	private int[] array ;
	
	public RecursiveBinarySearchArray(int[] filledArray){
		array=filledArray;
	}

	/*
	 * input validation to be done outside of this API
	 */
	public int recursiveBS(int searchKey, int sIndex, int eIndex) {

		int mIndex = (sIndex + eIndex) / 2;

		if (array[mIndex] == searchKey) {
			return mIndex;
		} else if(sIndex > eIndex){
			return -1;
		}
		else {
			if (array[mIndex] < searchKey) {
				return recursiveBS(searchKey, mIndex + 1, eIndex);
			} else {
				return recursiveBS(searchKey, sIndex, mIndex - 1);
	
			}
		}

	}

}
