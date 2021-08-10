import java.util.Scanner;

public class SwapVariableWithoutThirdVariable {

	public static void main(String[] args) 
	{
	
		int a,b;
		
		
		System.out.print("Enter the first number: ");
		Scanner s=new Scanner(System.in);
		a=s.nextInt();
		
		System.out.print("Enter the second number: ");
		b=s.nextInt();
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("now a is: "+a);
		System.out.print("now b is: "+b);
		

	}

}
