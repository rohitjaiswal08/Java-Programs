//break statement using while loop

public class BreakExample2 {
	public static void main(String[] args) {
		/* break statement is used to break loop or switch statement. 
		It breaks the current flow of the program at specified condition*/
		
		int i = 1;
	    while (i <= 10) {
	      System.out.println(i);
	      i++;
	      if (i == 5) //jumps out of the loop when i is equal to 5
	      {
	        break;
	      }
	    }  
	}
}
/*
Output : 
1
2
3
4
*/