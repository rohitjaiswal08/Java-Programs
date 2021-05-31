

public class Swap1 {

	public static void main(String[] args) {
		// Swapping using variable
		int a=15, b=20, temp;
		System.out.println("Before Swapping");
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		
		temp=a;
		a=b;
		b=temp;
		System.out.println("After Swapping");
		System.out.println("a = "+a);
		System.out.println("b = "+b);
	}

}

/*
Output : 
Before Swapping
a = 15
b = 20
After Swapping
a = 20
b = 15
*/