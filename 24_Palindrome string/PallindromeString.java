import java.util.Scanner;

public class PallindromeString {
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter string : ");
		String s=sc.next();
		int length=s.length();
		String rev="";
		for(int i=length-1;i>=0;i--) {
			rev=rev+s.charAt(i);
		}
		if(s.equalsIgnoreCase(rev)) {
			System.out.println(s + " is a palindrome string");
		}
		else {
			System.out.println(s + " is NOT a palindrome string");
		}
		sc.close();
	}
}

/*
Output : 
Enter string : mom
mom is a palindrome string

Enter string : java
java is NOT a palindrome string
*/