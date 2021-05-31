//break statement using for loop 

public class BreakExample1 {
	public static void main(String[] args) {
		/* break statement is used to break loop or switch statement. 
		It breaks the current flow of the program at specified condition*/
		
		 for(int i=1;i<=10;i++){  
		        if(i==5)
		        {    
		            break;   //jumps out of the loop when i is equal to 5
		        }  
		        System.out.println(i);  
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