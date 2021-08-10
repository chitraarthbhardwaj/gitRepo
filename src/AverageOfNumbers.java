import java.util.Scanner;

public class AverageOfNumbers {

	public static void main(String[] args) 
	{
	int a,b,c,counter=0;
	
	System.out.print("Enter the numbers:");
	Scanner s =new Scanner(System.in);
	int a1=s.nextInt();
	counter++;
	int a2=s.nextInt();
	counter++;
	int a3=s.nextInt();
	counter++;
	int a4=s.nextInt();
	counter++;
	
	System.out.print("Average of number is:"+(a1+a2+a3+a4)/counter);

	}

}
