public class IfElseIfProgram 
{
  public static void main(String[] args) 
  {
    int num = 30;
    if (num < 25) 
	{
      System.out.println(num +" is less than 25");
    } else if (num < 50) 
	{
	  System.out.println(num +" is less than 50 but ");
	  System.out.println(num + " is greater than 25");
    }  else 
	{
      System.out.println(num + " is greater than 50");
    }
  }
}

/*Output : 
30 is less than 50 but
30 is greater than 25
*/
