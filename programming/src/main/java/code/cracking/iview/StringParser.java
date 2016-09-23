package code.cracking.iview;

/*
 * StringParser - String utility class
 */
public class StringParser {
	
	//check if a String is unique or not
	public static boolean isUnique(String testStr){
		boolean[] charBool = new boolean[256];
		
		for(int i=0;i<testStr.length();i++){
			if(charBool[testStr.charAt(i)] == true){
				return false;
			}
			charBool[testStr.charAt(i)]=true;
		}
		return true;
	}

}
