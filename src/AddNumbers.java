import java.util.Scanner;

public class AddNumbers 
{
	public static void main(String args[])
	{
	int a,b;
	
	System.out.println("enter the first number: ");
	Scanner s=new Scanner(System.in);
	a=s.nextInt();
	
	System.out.println("enter the second number: ");
	Scanner s1=new Scanner(System.in);
	b=s.nextInt();
	
	System.out.print("sum is: "+(a+b));
	}

}
