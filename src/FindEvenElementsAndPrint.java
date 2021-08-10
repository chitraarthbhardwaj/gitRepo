import java.util.ArrayList;

public class FindEvenElementsAndPrint {

	public static void main(String[] args) 
	{
		ArrayList<Integer> SB=new ArrayList();
		
		for(int i=0;i<100;i++)
		{
		SB.add(i);
		System.out.println("This is element number: "+SB.indexOf(i));
		
		if(SB.indexOf(i)%2==1)
			System.out.println("Meeka");
		else
			System.out.println(SB.indexOf(i));
		
		
		
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
