import java.util.Scanner;

public class FindAlphabetsInAString {

	public static void main(String[] args)
	{
	int counter=0;
		System.out.print("Enter the string: " );
		Scanner s=new Scanner(System.in);
		String c=s.next();
		
		System.out.print("Enter the alphabet: ");
		String c1=s.next();
		
		for(int i=0;i<=c.length()-1;i++)
		{
			if(c.charAt(i)==c1.charAt(0))
			{
				counter++;
			}
		}
		System.out.print("Number of "+c1+": "+counter);
		

	}

}
