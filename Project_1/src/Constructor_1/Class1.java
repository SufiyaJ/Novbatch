package Constructor_1;

public class Class1
{
	
	public Class1()
	{
		this(88,99,90);
		System.out.println("default constructor");
	}
	public Class1(int a)
	{
		this();
		System.out.println("one paramertized constructor");
	}
	public Class1(int a ,int b)
	{
		this(2);
		System.out.println("two paramertized constructor");
	}
	public Class1(int a ,int b,int c)
	{
		System.out.println("three paramertized constructor");
	}
	public Class1(int a ,int b,int c,int d)
	{
		this(23,33);
		System.out.println("four paramertized constructor");
	}
	public static void main(String[] args) {
		Class1 obj1 =new Class1(34,67,88,67);
		
	}
}
