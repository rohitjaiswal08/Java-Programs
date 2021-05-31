import java.util.Scanner;
public class ReverseNo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num=sc.nextInt();
		System.out.println("Entered number : "+num);
		int rev=0;
		while(num!=0) {
			int rem = num%10;
			rev=rev*10 +rem;
			num= num/10;
		}
		
		System.out.println("Reverse number : "+rev);
		sc.close();
	}

}

/*
Output : 
Enter a number : 92647
Entered number : 92647
Reverse number : 74629
*/