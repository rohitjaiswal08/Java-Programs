public class Fibonacci {

	public static void main(String[] args) {
		//next no is the sum of previous nos eg. 0,1,1,2,3,5,8,13,21
		//first two nos. of fibonacci series is 0 and 1
		int n1=0, n2=1,n3, i ;
		System.out.print(n1+ " " +n2);
		for(i=2; i<10; i++)
		{
			n3= n1+n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
		}
	}

}
