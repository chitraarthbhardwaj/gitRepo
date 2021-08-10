import java.util.Scanner;

public class FindSubString 
{
	public static void main(String[] args) 
	{
		int counter=0;
		
		System.out.print("Enter the string: ");
		Scanner s=new Scanner(System.in);
		String s1=s.next();
		
		System.out.print("Enter sub one: ");
		String s2=s.next();
		System.out.println("s1 length:"+s1.length());
		System.out.println("s2 length:"+s2.length());		
		
		//loop for main string counter
		for(int i=0;i<=s1.length()-1;i++)
		{//loop for substring counter
			for(int j=0;j<=s2.length()-1;j++)
			{
				
				if(s2.length()<=s1.length())
				{
					System.out.println("in here");
					if(s1.charAt(i)==s2.charAt(j))
					{
					counter++;
					}	
				}
			}
			if((counter)==s2.length())
			{
				System.out.println("is a substring");
				break;
			}
			else
				System.out.println("not substring ");
		}						
	}
}