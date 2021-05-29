import java.util.Scanner;
class ComparisionOperators
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("---------- Input ---------");
		System.out.print("Enter first number : ");
		int num1= sc.nextInt();
		System.out.print("Enter second number : ");
		int num2= sc.nextInt();
		
		System.out.println("---------- Output ---------");
		
		//Equal to
		System.out.println(num1 + " is equal to " + num2 + " = " + (num1==num2));
		
		//Not equal
		System.out.println(num1 + " is not equal to " + num2 + " = " + (num1!=num2));
		
		//Greater than
		System.out.println(num1 + " is greater than " + num2 + " = " + (num1>num2));
		
		//Less than
		System.out.println(num1 + " is less than " + num2 + " = " + (num1<num2));
		
		//Greater than or equal to	
		System.out.println(num1 + " is greater than or equal to " + num2 + " = " + (num1>=num2));
		
		//Less than or equal to	
		System.out.println(num1 + " is less than or equal to " + num2 + " = " + (num1<=num2));

		sc.close();
	}
}

/* Output : 
C:\Users\Rohit B Jaiswal\Desktop\Java>javac ComparisionOperators.java
C:\Users\Rohit B Jaiswal\Desktop\Java>java ComparisionOperators
---------- Input ---------
Enter first number : 2
Enter second number : 2
---------- Output ---------
2 is equal to 2 = true
2 is not equal to 2 = false
2 is greater than 2 = false
2 is less than 2 = false
2 is greater than or equal to 2 = true
2 is less than or equal to 2 = true

C:\Users\Rohit B Jaiswal\Desktop\Java>java ComparisionOperators
---------- Input ---------
Enter first number : 2
Enter second number : 4
---------- Output ---------
2 is equal to 4 = false
2 is not equal to 4 = true
2 is greater than 4 = false
2 is less than 4 = true
2 is greater than or equal to 4 = false
2 is less than or equal to 4 = true

C:\Users\Rohit B Jaiswal\Desktop\Java>java ComparisionOperators
---------- Input ---------
Enter first number : 5
Enter second number : 3
---------- Output ---------
5 is equal to 3 = false
5 is not equal to 3 = true
5 is greater than 3 = true
5 is less than 3 = false
5 is greater than or equal to 3 = true
5 is less than or equal to 3 = false
*/