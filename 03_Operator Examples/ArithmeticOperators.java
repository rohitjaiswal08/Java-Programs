import java.util.Scanner;
class ArithmeticOperators
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
		
		//Adds two values
		int addition=num1+num2;
		System.out.println("Addition of " + num1 + " and " + num2 +" = " + addition);
		
		//Subtracts one value from another
		int subtraction = num1 - num2;
		System.out.println("Subtraction of " + num1 + " and " + num2 +" = " + subtraction);
		
		//Multiplies two values
		int multiplication = num1 * num2;
		System.out.println("Multiplication of " + num1 + " and " + num2 +" = " + multiplication);
		
		//Divides one value by another
		float division = num1 / num2;
		System.out.println("Division of " + num1 + " and " + num2 +" = " + division);
		
		//Returns the division remainder	
		int modulus = num1 % num2;
		System.out.println("Modulus of " + num1 + " and " + num2 +" = " + modulus);
		sc.close();
	}
}

/* Outputs : 
C:\Users\Rohit B Jaiswal\Desktop\Java>javac ArithmeticOperators.java
C:\Users\Rohit B Jaiswal\Desktop\Java>java ArithmeticOperators
---------- Input ---------
Enter first number : 18
Enter second number : 4
---------- Output ---------
Addition of 18 and 4 = 22
Subtraction of 18 and 4 = 14
Multiplication of 18 and 4 = 72
Division of 18 and 4 = 4.0
Modulus of 18 and 4 = 2

C:\Users\Rohit B Jaiswal\Desktop\Java>java ArithmeticOperators
---------- Input ---------
Enter first number : 2
Enter second number : 6
---------- Output ---------
Addition of 2 and 6 = 8
Subtraction of 2 and 6 = -4
Multiplication of 2 and 6 = 12
Division of 2 and 6 = 0.0
Modulus of 2 and 6 = 2
*/
