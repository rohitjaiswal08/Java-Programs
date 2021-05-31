class Student{  
	int id;  
	String name;  
} 

public class ObjectClassExample1 {
	public static void main(String[] args) 
	{
		Student s1=new Student();
		Student s2=new Student();
		s1.id=11;  
		s1.name="Abc";
		s2.id=21;  
		s2.name="Xyz";		
		System.out.println(s1.id+" "+s1.name);
		System.out.println(s2.id+" "+s2.name);
	}
}
/*
Output : 
11 Abc
21 Xyz
*/
