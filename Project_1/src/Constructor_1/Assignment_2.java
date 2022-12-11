package Constructor_1;

public class Assignment_2 {
	
	public int multi(int a, int b)
	{
		int M;
		M= a*b;
		System.out.println("Multi is" +M);
		return M;
	}
	public int sub(int a1, int b1)
	{
		int S;
		S=a1-b1;
		System.out.println("SUB is" +S);
		return S;
	}
	public int sum(int a3, int b3)
	{
		int SM;
		SM= a3+b3;
		System.out.println("SUM is" +SM);
		return SM;
	}
	public int sub1(int a4, int b4)
	{
		int SB;
		SB=a4-b4;
		System.out.println("Sub1 is" +SB);
		return SB;
	}
	public int div(int a5, int b5)
	{
		int D;
		D=a5/b5;
		System.out.println("Div is" +D);
		return D;
	}
	public static void main(String[] args) {
		
		Assignment_2 Multiresult = new Assignment_2();
		int multiresult1 = Multiresult.multi(10, 2);
		
		Assignment_2 Subresult =new Assignment_2();
		int subresult1 = Subresult.sub(multiresult1, 2);
		
		Assignment_2 Sumresult =new Assignment_2();
		int sumresult1 = Sumresult.sum(subresult1, 2);
		
		Assignment_2 Sub1result =new Assignment_2();
		int subresult2 = Sub1result.sub1(sumresult1, 2);
		
		Assignment_2 divresult =new Assignment_2();
		int divresult1 = divresult.div(subresult2, 2);
		
		
	}
}
