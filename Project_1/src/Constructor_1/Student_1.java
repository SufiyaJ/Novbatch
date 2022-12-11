package Constructor_1;

public class Student_1 {

	int Rollnumber;
	int Age;
	
	public void display1() 
	{
		System.out.println("Welcome to all of you");
		
	}
	
	public void display2()
	{
		System.out.println("Automation is very easy");
			
	}
	
	public static void main (String[] args)
	{
		Student_1 ABC = new Student_1();
		ABC.display1();
		ABC.display2();
		ABC.Rollnumber =1;
		System.out.println(ABC.Rollnumber);
		ABC.Age=20;
		System.out.println(ABC.Age);
	}}

