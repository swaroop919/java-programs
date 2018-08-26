package swa;

public class Middle {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		String s="code";
				System.out.println(s);
				removemiddleChars(s) ;
	}
public static String removemiddleChars(String s) {
			  int word = s.length();
			  String start = s.substring(0, word / 2);
			  String end = s.substring((word / 2) + 1 , s.length());
			   System.out.println(start + end);
			  return start + end;
			 
			}

	//}

}
