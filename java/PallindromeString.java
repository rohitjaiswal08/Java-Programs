
public class PallindromeString {

	public static void main(String[] args) {
		String s="mom";
		int length=s.length();
		String rev="";
		for(int i=length-1;i>=0;i--) {
			rev=rev+s.charAt(i);
		}
		if(s.equals(rev)) {
			System.out.println(s + " is a pallindrome string");
		}
		else {
			System.out.println(s + " is NOT a pallindrome string");
		}
		

	}

}
