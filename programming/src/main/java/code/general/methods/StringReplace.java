package code.general.methods;

public class StringReplace {
	
	public String strReplace(String str, char ch, char rch ){
		System.out.println("str: "+str+" char : "+ch+" rch: "+rch);
		if(str == null){
			System.out.println("Error: Null input");
			return str;
		}
		char charArr[] = new char[str.length()];
		char tempchar;
		for(int i=0;i<str.length();i++){
			tempchar=str.charAt(i);
			if(tempchar==ch){
				charArr[i]=rch;
				System.out.println("char : "+String.valueOf(charArr)+" i: "+i);
			}else{
				charArr[i]=tempchar;
			}
		}
		
		return String.valueOf(charArr);		
	}

}
