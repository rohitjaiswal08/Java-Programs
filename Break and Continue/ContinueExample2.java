//continue statement using while loop

public class ContinueExample2 {
	public static void main(String[] args) {
/* continue statement breaks one iteration (in the loop), if a specified condition occurs, 
 * and continues with the next iteration in the loop.*/
		
		int i = 1;
	    while (i <= 10) {
	      if (i == 5) ///skip the value of 5
	      {
	        i++;
	        continue;
	      }
	      System.out.println(i);
	      i++;
	    }  	
	}
}
/*
1
2
3
4
6
7
8
9
10
*/
