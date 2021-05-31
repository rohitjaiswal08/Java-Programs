
//import java.util.Scanner;
public class Swap2 {

	public static void main(String[] args) {
		// Swapping using variable
		//Scanner sc = new Scanner(System.in);
		//System.out.print("Enter first number : ");
		//int a= sc.nextInt();
		//System.out.print("Enter second number : ");
		//int b= sc.nextInt();
		int a=5, b=3;
		//int temp;
		System.out.println("Before Swapping");
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		
		a +=b; //5+3=8
		b =a-b; //8-3=3
		a -=b; // 8-3=5
		System.out.println("After Swapping");
		System.out.println("a = "+a);
		System.out.println("b = "+b);		
	}
}

/*
Output : 
Before Swapping
a = 5
b = 3
After Swapping
a = 3
b = 5
*/