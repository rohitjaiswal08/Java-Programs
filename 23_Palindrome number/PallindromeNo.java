import java.util.Scanner;
public class PallindromeNo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num=sc.nextInt();
		int temp=num;
		int rev=0;
		while(temp!=0) {
			int rem = temp%10;
			rev=rev*10 +rem;
			temp= temp/10;
		}
		if(num==rev) {
			System.out.println(num + " is a palindrome number");
		}
		else {
			System.out.println(num + " is NOT a palindrome number");
		}
		
		sc.close();
	}

}

/*
Output : 
Enter a number : 121
121 is a palindrome number

Enter a number : 514
514 is NOT a palindrome number
*/