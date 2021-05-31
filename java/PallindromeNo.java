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
			System.out.println(num + " is a pallindrome number");
		}
		else {
			System.out.println(num + " is NOT a pallindrome number");
		}
		
		sc.close();
	}

}
