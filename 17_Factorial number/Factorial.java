import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number : ");
		int n=sc.nextInt();
		//int n=5; 
		int fact =1;
		for(int i=n; i>=1; i--) {
			fact= fact*i;
		}
		System.out.println("Factorial of "+n+" = "+fact);
		sc.close();
	}

}
/*
Output : 
Enter number : 5
Factorial of 5 = 120
*/