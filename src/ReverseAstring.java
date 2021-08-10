import java.util.Scanner;

public class ReverseAstring {

	public static void main(String[] args) 
	{
	System.out.print("Enter the string: ");
	Scanner s=new Scanner(System.in);
	String s1=s.next();
	s1.toCharArray();
	
	for(int i=s1.length()-1;i>=0;i--)
	{
		System.out.print(s1.charAt(i));
	}

	}

}
