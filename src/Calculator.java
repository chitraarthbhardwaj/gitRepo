import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) 
	{
		int a,b;
		int result=0;
		
		System.out.println("enter the first number: ");
		Scanner s=new Scanner(System.in);
		a=s.nextInt();
		System.out.println("enter the second number: ");
		Scanner s1=new Scanner(System.in);
		b=s.nextInt();
		
		System.out.print("Enter the operation: ");
		Scanner s2=new Scanner(System.in);
		String c=s2.next();
		char c1=c.charAt(0);
		
		if(c1=='+')
		{
			result=a+b;
		System.out.print(result);
		}else if(c1=='-')
		{	result=a-b;
		System.out.print(result);
		}else if(c1=='/')
		{	result=a/b;
		System.out.print(result);
		}else if(c1=='*')
		{	result=a*b;
		System.out.print(result);
		}else if(c1=='%')
		{	result=a%b;
		System.out.print(result);
		}
		
		
		
	}

}
