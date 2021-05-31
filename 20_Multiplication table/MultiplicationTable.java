import java.util.Scanner;
public class MultiplicationTable {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter which table you want : ");
		int n =sc.nextInt();
		
		for(int i=1; i<=10; i++) {
			System.out.println(n + " * "+ i +" = "+(n*i));
		}
		sc.close();
	} 
}

/*
Output : 
Enter which table you want : 8
8 * 1 = 8
8 * 2 = 16
8 * 3 = 24
8 * 4 = 32
8 * 5 = 40
8 * 6 = 48
8 * 7 = 56
8 * 8 = 64
8 * 9 = 72
8 * 10 = 80

Enter which table you want : 17
17 * 1 = 17
17 * 2 = 34
17 * 3 = 51
17 * 4 = 68
17 * 5 = 85
17 * 6 = 102
17 * 7 = 119
17 * 8 = 136
17 * 9 = 153
17 * 10 = 170
*/