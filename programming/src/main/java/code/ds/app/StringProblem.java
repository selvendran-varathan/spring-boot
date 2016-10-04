package code.ds.app;

public class StringProblem {
	/*
	 * Assumes its only A-Z
	 */
	public static boolean isDupCharPresentInStr(String str){
		boolean[] chars = new boolean[26];
		String strUpper=str.toUpperCase();
		
		for(int i=0, n = strUpper.length();i<n;i++){
			char c = strUpper.charAt(i);
			if(c >= 'A' && c <= 'Z'){
				if(chars[c-'A']){
					System.out.println("Duplicate char found: "+c);
					return true;
				}
				chars[c-'A']=true;
			}
		}
		return false;
		
	}
	
	public static String reverseString(String str){
		if(str == null){
			throw new IllegalArgumentException("Null input");
		}
		char[] strChars = str.toCharArray();
		int length=str.length();
		for(int i=0,j=length-1;i<(str.length()/2);i++,j--){
			char c = strChars[i];
			strChars[i]=strChars[j];
			strChars[j]=c;
		}
		return String.valueOf(strChars);
	}
	
	public static String reverseStrRec(String str){
		if(str == null || str.trim().equals("")){
			throw new IllegalArgumentException("Null input");
		}
		return recursiveReverse(str,str.length());
	}

	private static String recursiveReverse(String str,int length){
		if(length == 0){
			return "";
		}
		return recursiveReverse(str.substring(1),length-1)+str.charAt(0);
	}
	
	public static char[] removeDuplicates(char[] str){
		int uniqueEndIndex=0;
		if(str == null){
			throw new IllegalArgumentException("Null input");
		}
		if(str.length <2)
			return str;
		for(int i=1; i<str.length;i++){
			int j;
			for(j=0;j<=uniqueEndIndex;j++){
				if(str[i]==str[j]) {
					str[i]=0;
					break;
				}
			}
			if(j == uniqueEndIndex){
				str[++uniqueEndIndex]=str[i];
			}
		}
		return str;
		
	}
}
