package swa;

public class tse {
	public static void main(String[] args){
	String str="coddskdlsdkldksdklsdklskdlskdlsdksldklskdldklsk";
	System.out.println(str);
	tse.frontBack (str);
	}
	public static String frontBack(String str) {
		if(str.length()==1){
		 str=str;
		}
		String s=str.charAt(str.length()-1)+str.substring(1,str.length()-1)+str.charAt(0);
		System.out.println(s);
		return s;
	
		}

}

   