import java.util.Scanner;
class UserInput
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		//for string
		System.out.print("Enter your name : ");
		String name = sc.nextLine();
		
		//for int 
		System.out.print("Enter your roll no. : ");
		int roll_no = sc.nextInt();
		
		//for float
		System.out.print("Enter your percentage : ");
		float percentage = sc.nextFloat();
		
		System.out.println("Name : " + name);
		System.out.println("Roll No. : " + roll_no);		
		System.out.println("Percentage : " + percentage);
	
		// closing scanner
		sc.close();
	}
}
