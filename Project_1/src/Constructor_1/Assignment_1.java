package Constructor_1;
import java.nio.charset.MalformedInputException;

import org.omg.Messaging.SyncScopeHelper;

public class Assignment_1 {
	
	public int sum (int a ,int b)
	{
		int c;
		c=a+b;
		System.out.println("sum is" +c);
		return c;
	}
	public int sub (int a1 , int b1)
	{
		int sub1;
		sub1= a1-b1;
		System.out.println("sub is" +sub1);
		return sub1;
	}
	public int mul (int a3 , int b3)
	{
		int mul1;
		mul1= a3*b3;
		System.out.println("multi is" +mul1);
		return mul1;
	}
	public  void div (int a4, int b4)
	{
		int div1;
		div1=a4/b4;
		System.out.println("div is" +div1);
		
	}
	public static void main(String[] args) {
		
		Assignment_1 FirstSum = new Assignment_1();
		
		int sumresult = FirstSum.sum(10,2);
		int sumresult2=FirstSum.sum(sumresult,2);
		Assignment_1 FirstSub =new Assignment_1();
		int subresult=FirstSub.sub(sumresult2,2);
		Assignment_1 FirstMul =new Assignment_1();
		int multiresult=FirstMul.mul(subresult,2);
		Assignment_1 FirstDiv =new Assignment_1();
	
		
	}
	
}

