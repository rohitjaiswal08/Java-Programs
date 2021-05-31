//continue statement using for loop

public class ContinueExample1 {
	public static void main(String[] args) {
/* continue statement breaks one iteration (in the loop), if a specified condition occurs, 
 * and continues with the next iteration in the loop.*/
		
		for (int i = 1; i <= 10; i++) {
		      if (i == 5) //skip the value of 5
		      {
		        continue;
		      }
		      System.out.println(i);
		    }  

	}

}
