package code.ds.impl;

public class BinarySearchSortedArray {
	
	public static int[] studentArr = new int[100];
	
	public boolean isKeyPresent(int searchKey){
		int sIndex=0;
		int lIndex=studentArr.length-1;
		int mIndex;
		int attempt=0;
		if(searchKey < 0 || searchKey > 99){
			System.out.println("isKeyPresent: Invalid Key: search Key should be in the range (0-99)");
			return false;
		}
		while(sIndex<=lIndex){
			attempt++;
			System.out.println("sIndex: "+sIndex+" lIndex:"+lIndex);
			mIndex=(sIndex+lIndex)/2;
			if(studentArr[mIndex] == searchKey){
				System.out.format("isKeyPresent: Value matched in %s attempt \n",attempt);
				return true;
			}else if (searchKey > studentArr[mIndex]){
				sIndex = mIndex+1;
			}else{
				lIndex = mIndex-1;
			}
			System.out.format("isKeyPresent: Value is not matched in %s attempt\n",attempt);
			
		}
		return false;
	}
	public boolean isKeyPresent2(int searchKey){
		int sIndex=0;
		int lIndex=studentArr.length;
		int mIndex;
		int attempt=0;
		
		if(searchKey < 0 || searchKey > 99){
			System.out.println("isKeyPresent2: Invalid Key: search Key should be in the range (0-99)");
			return false;
		}
		while(sIndex<=lIndex){
			attempt++;
			mIndex=(sIndex+lIndex)/2;
			if (searchKey > studentArr[mIndex]){
				sIndex = mIndex+1;
			}else if(searchKey < studentArr[mIndex]){
				lIndex = mIndex-1;
			}else{
				System.out.format("isKeyPresent2: Value matched in %s attempt \n",attempt);
				return true;
			}
			System.out.format("isKeyPresent2: Value is not matched in %s attempt\n",attempt);
		}
		return false;
	}
	
	public void assignArray(){
		for(int i=0;i<100;i++){
			studentArr[i]=i;
		}
	}
	/*public static void main(String args[]){
		assignArray();
		Scanner scaner = new Scanner(System.in);
		int searchKey = scaner.nextInt();
		scaner.close();
		isKeyPresent(searchKey);
		isKeyPresent2(searchKey);
	}*/
}
