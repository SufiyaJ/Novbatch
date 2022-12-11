package Constructor_1;

public class Methods {
	
	public Methods()
	{
		
		System.out.println("Default method");
	}
	public Methods(int a)
	{
		this(9,9,9);
		System.out.println("one paramertized method");
	}
	public Methods(int a, int b)
	{
		this(9);
		System.out.println("two paramertized method");
		
	}
	public Methods(int a, int b,int c)
	{
		this();
		System.out.println("three paramertized method");
	}
	public Methods(int a, int b,int c,int d)
	{
		this(56,90);
		System.out.println("four paramertized method");
	}
	public static void main(String[] args) {
		Methods obj =new Methods(12,23,22,67);
		
	}

}
